import java.awt.image.BufferedImage;

/**
 * Represents a picture. This class inherits from SimplePicture and
 * allows the student to add functionality to the Picture class.
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture {

  /**
   * Default constructor. Not needed but shows students the implicit
   * call to super(). Child constructors always call a parent constructor.
   */
  public Picture() {
    super();
  }

  /**
   * Constructor that takes a file name and creates the picture.
   * 
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName) {
    // lets the parent class handle this fileName
    super(fileName);
  }

  /**
   * Constructor that takes the width and height.
   * 
   * @param height the height of the desired picture
   * @param width  the width of the desired picture
   */
  public Picture(int height, int width) {
    // lets the parent class handle this width and height
    super(width, height);
  }

  /**
   * Constructor that takes a picture and creates a copy of that picture.
   * 
   * @param copyPicture the picture to copy
   */
  public Picture(Picture copyPicture) {
    // lets the parent class do the copy
    super(copyPicture);
  }

  /**
   * Constructor that takes a buffered image.
   * 
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image) {
    super(image);
  }

  /**
   * Copies from the passed fromPic to the specified startRow and
   * startCol in the current picture.
   * 
   * @param fromPic  the picture to copy from
   * @param startRow the start row to copy to
   * @param startCol the start col to copy to
   */
  public void copy(Picture fromPic, int startRow, int startCol) {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = 0, toRow = startRow; fromRow < fromPixels.length
        && toRow < toPixels.length; fromRow++, toRow++) {
      for (int fromCol = 0, toCol = startCol; fromCol < fromPixels[0].length
          && toCol < toPixels[0].length; fromCol++, toCol++) {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }
  }

  /** Creates a collage of several pictures. */
  public void createCollage() {
    Picture flower1 = new Picture("flower1.jpg");
    Picture flower2 = new Picture("flower2.jpg");
    this.copy(flower1, 0, 0);
    this.copy(flower2, 100, 0);
    this.copy(flower1, 200, 0);
    Picture flowerNoBlue = new Picture(flower2);
    flowerNoBlue.zeroBlue();
    this.copy(flowerNoBlue, 300, 0);
    this.copy(flower1, 400, 0);
    this.copy(flower2, 500, 0);
    this.write("collage.jpg");
  }

  /**
   * Returns a string with information about this picture.
   * 
   * @return a string with fileName, height, and width
   */
  public String toString() {
    String output = "Picture, filename " + getFileName() +
        " height " + getHeight() + " width " + getWidth();
    return output;
  }

  /************************************
   * 6.C Lab
   ************************************/

  /**
   * Sets the blue to 0.
   */
  public void zeroBlue() {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels) {
      for (Pixel pixelObj : rowArray) {
        pixelObj.setBlue(0);
      }
    }
  }

  /**
   * Sets the red and green values of each pixel to 0.
   */
  public void keepOnlyBlue() {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels) {
      for (Pixel pixelObj : rowArray) {
        pixelObj.setRed(0);
        pixelObj.setGreen(0);
      }
    }
  }

  /**
   * Sets all red, green, and blue values of each pixel to 255 - current value.
   */
  public void negate() {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels) {
      for (Pixel pixelObj : rowArray) {
        pixelObj.setBlue(255 - pixelObj.getBlue());
        pixelObj.setRed(255 - pixelObj.getRed());
        pixelObj.setGreen(255 - pixelObj.getGreen());
      }
    }
  }

  /**
   * Sets all red, green, and blue values of each pixel to the average of the
   * current values.
   */
  public void grayscale() {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels) {
      for (Pixel pixelObj : rowArray) {
        int value = (pixelObj.getBlue() + pixelObj.getRed() + pixelObj.getGreen()) / 3;
        pixelObj.setBlue(value);
        pixelObj.setRed(value);
        pixelObj.setGreen(value);
      }
    }
  }

  /**
   * Enhances the pixels that are the least like water.
   */
  public void fixUnderwater() {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels) {
      for (Pixel pixelObj : rowArray) {
        pixelObj.setBlue((int) (pixelObj.getBlue() * .9));

        pixelObj.setRed(0);
        pixelObj.setGreen((int) (pixelObj.getGreen() * .9));
      }
    }
  }

  /************************************
   * 6.D Lab
   ************************************/

  /**
   * Mirrors the picture around a vertical mirror in the center of the picture
   * from left to right.
   */
  public void mirrorVerticalLeftToRight() {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++) {
      for (int col = 0; col < width / 2; col++) {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        rightPixel.setColor(leftPixel.getColor());
      }
    }
  }

  /**
   * Mirrors the picture around a vertical mirror in the center of the picture
   * from right to left.
   */
  public void mirrorVerticalRightToLeft() {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++) {
      for (int col = 0; col < width / 2; col++) {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        leftPixel.setColor(rightPixel.getColor());
      }
    }
  }

  /**
   * Mirrors the picture around a horizontal mirror in the center of the picture
   * from top to bottom.
   */
  public void mirrorHorizontalTopToBottom() {
    Pixel[][] pixels = this.getPixels2D();
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    int height = pixels.length;
    for (int row = 0; row < height / 2; row++) {
      for (int col = 0; col < pixels[0].length; col++) {
        topPixel = pixels[row][col];
        bottomPixel = pixels[height - 1 - row][col];
        bottomPixel.setColor(topPixel.getColor());
      }
    }
  }

  /**
   * Mirrors the picture around a horizontal mirror in the center of the picture
   * from bottom to top.
   */
  public void mirrorHorizontalBottomToTop() {
    Pixel[][] pixels = this.getPixels2D();
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    int height = pixels.length;
    for (int row = 0; row < height / 2; row++) {
      for (int col = 0; col < pixels[0].length; col++) {
        topPixel = pixels[row][col];
        bottomPixel = pixels[height - 1 - row][col];
        topPixel.setColor(bottomPixel.getColor());
      }
    }
  }

  /**
   * Mirrors the picture around a diagonal mirror starting in the upper-left
   * corner and continuing at a 45-degree angle.
   */
  public void mirrorDiagonal() {
    Pixel[][] pixels = this.getPixels2D();
    Pixel firstPixel = null;
    Pixel secondPixel = null;
    for (int row = 0; row < pixels.length && row < pixels[0].length; row++) {
      for (int col = 0; col < pixels[0].length && col < pixels.length; col++) {
        firstPixel = pixels[row][col];
        secondPixel = pixels[col][row];
        if (pixels.length < pixels[0].length) {
          secondPixel.setColor(firstPixel.getColor());
        } else {
          firstPixel.setColor(secondPixel.getColor());
        }
      }
    }
  }

  /************************************
   * 6.E Lab
   ************************************/

  /**
   * Mirrors just part of a picture of a temple.
   */
  public void mirrorTemple() {
    int mirrorPoint = 276;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = this.getPixels2D();

    // loops through the rows
    for (int row = 27; row < 97; row++) {
      // loops from 13 to just before the mirror point
      for (int col = 13; col < mirrorPoint; col++) {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][mirrorPoint - col + mirrorPoint];
        rightPixel.setColor(leftPixel.getColor());
      }
    }
  }

  /**
   * Mirrors just part of a picture of a snowman.
   */
  public void mirrorArms() {
    // col 100 to 300
    // row 165 195
    Pixel[][] pixels = this.getPixels2D();
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    int height = 195;
    for (int row = 165; row < 195; row++) {
      for (int col = 100; col < 300; col++) {
        topPixel = pixels[row][col];
        bottomPixel = pixels[height - (row - 195)][col];
        bottomPixel.setColor(topPixel.getColor());
      }
    }

  }

  /**
   * Mirrors just part of a picture of a swan.
   */
  public void mirrorSwan() {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++) {
      for (int col = 0; col < width / 2; col++) {

        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        if (!(rightPixel.getRed() > 20 && rightPixel.getRed() < 80)) {
          leftPixel.setColor(rightPixel.getColor());
        }
      }
    }
    // col 300 to 400
    for (int row = 60; row < 185; row++) {
      for (int col = 200; col < 300; col++) {

        leftPixel = pixels[row][col];
        rightPixel = pixels[row][col + 100];
        if (!(rightPixel.getRed() > 20 && rightPixel.getRed() < 80)) {
          leftPixel.setColor(rightPixel.getColor());
        }
      }
    }
  }

  /************************************
   * 6.F Lab
   ************************************/

  /**
   * Method to _________________________________
   */
  public void change1(Picture inputPic) {
    Pixel[][] pixels = this.getPixels2D();
    Pixel[][] pixelsTwo = inputPic.getPixels2D();
    for (int row = 0; row < pixels.length; row++) {
      for (int col = 0; col < pixels[0].length; col++) {
        if (row < pixelsTwo.length && col < pixelsTwo[0].length) {
          pixels[row][col].setBlue((pixels[row][col].getBlue() + pixelsTwo[row][col].getBlue()) / 2);
          pixels[row][col].setRed((pixels[row][col].getRed() + pixelsTwo[row][col].getRed()) / 2);
          pixels[row][col].setGreen((pixels[row][col].getGreen() + pixelsTwo[row][col].getGreen()) / 2);
        }
      }
    }
  }

  /**
   * Method to _________________________________
   */
  public void change2() {
    Pixel[][] pixels = this.getPixels2D();
    for (int i = 0; i < 2; i++) {
      double blueMult = Math.random() + .5;
      double redMult = Math.random() + .5;
      double greenMult = Math.random() + .5;
      int blueAdd =0 ;//(int) (Math.random() * 100 - 50);
      int redAdd = 0;//(int) (Math.random() * 100 - 50);
      int greenAdd =0; //(int) (Math.random() * 100 - 50);
      System.out.println(blueMult);
      for (int row = 0; row < pixels.length; row++) {
        for (int col = 0; col < pixels[0].length; col++) {
          pixels[row][col].setBlue((int) (pixels[row][col].getBlue() * blueMult + blueAdd));
          pixels[row][col].setRed((int) (pixels[row][col].getRed() * redMult + redAdd));
          pixels[row][col].setGreen((int) (pixels[row][col].getGreen() * greenMult + greenAdd));
        }
      }
    }
  }

  public void change3() {
    Pixel[][] pixels = this.getPixels2D();
    for (int row = 0; row < pixels.length; row++) {
      for (int col = 0; col < pixels[0].length; col++) {
        if (row % 15 == 0 || row % 17 == 0) {
          pixels[row][col].setBlue(200);
          pixels[row][col].setRed(140);
          pixels[row][col].setGreen(20);
        }
      }
    }
  }

}