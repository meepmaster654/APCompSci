import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.*;
import java.io.*;
import java.awt.geom.*;

/**
 * SimplePicture represents a simple picture.  A simple picture may have an associated
 * file name and a title.  A simple picture has pixels, width, and height.  A simple
 * picture uses a BufferedImage to hold the pixels.  You can show a simple picture in
 * a PictureFrame (a JFrame).  You can also explore a simple picture.
 * 
 * @author Barb Ericson ericson@cc.gatech.edu
 */
public class SimplePicture implements DigitalPicture {
  /**
   * the file name associated with the simple picture
   */
  private String fileName;
  
  /**
   * the title of the simple picture
   */
  private String title;
  
  /**
   * buffered image to hold pixels for the simple picture
   */
  private BufferedImage bufferedImage;
  
  /**
   * frame used to display the simple picture
   */
  private PictureFrame pictureFrame;
  
  /** 
   * extension for this file (jpg or bmp)
   */
  private String extension;
  
  /**
   * Default constructor creates a picture with a width of 200 and a height of 100 
   * that is all white. A no-argument constructor must be given in order for a class
   * to be able to be subclassed.  By default all subclasses will implicitly call 
   * this in their parent's no argument constructor unless a different call to super()
   * is explicitly made as the first line of code in a constructor.
   */
  public SimplePicture() 
  { this(200,100); }
  
  /**
   * A constructor that takes a file name and uses the file to create a picture.
   * 
   * @param fileName  the file name to use in creating the picture
   */
  public SimplePicture(String fileName) {
    // loads the picture into the buffered image 
    load(fileName);
  }
  
  /**
   * A constructor that takes the width and height desired for a picture and
   * creates a buffered image of that size.  This constructor doesn't show the
   * picture.  The pixels will all be white.
   * 
   * @param width the desired width
   * @param height the desired height
   */
  public  SimplePicture(int width, int height) {
    bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
    title = "None";
    fileName = "None";
    extension = "jpg";
    setAllPixelsToAColor(Color.white);
  }
  
  /**
   * A constructor that takes the width and height desired for a picture and creates a buffered
   * image of that size.  It also takes the color to use for the background of the picture.
   * 
   * @param width     the desired width
   * @param height    the desired height
   * @param theColor  the background color for the picture
   */
  public  SimplePicture(int width, int height, Color theColor) {
    this(width,height);
    setAllPixelsToAColor(theColor);
  }
  
  /**
   * A constructor that takes a picture to copy information from.
   * 
   * @param copyPicture  the picture to copy from
   */
  public SimplePicture(SimplePicture copyPicture) {
    if (copyPicture.fileName != null) {
      this.fileName = new String(copyPicture.fileName);
      this.extension = copyPicture.extension;
    }
    if (copyPicture.title != null)
      this.title = new String(copyPicture.title);
    if (copyPicture.bufferedImage != null) {
      this.bufferedImage = new BufferedImage(copyPicture.getWidth(),
                                             copyPicture.getHeight(), BufferedImage.TYPE_INT_RGB);
      this.copyPicture(copyPicture);
    }
  }
  
  /**
   * A constructor that takes a buffered image.
   * 
   * @param image  the buffered image
   */
  public SimplePicture(BufferedImage image) {
    this.bufferedImage = image;
    title = "None";
    fileName = "None";
    extension = "jpg";
  }
  
  /**
   * Gets the extension for this picture.
   * 
   * @return  the extendsion (jpg, bmp, giff, etc)
   */
  public String getExtension() { return extension; }
  
  /**
   * Copies all of the passed source picture into the current picture object.
   * 
   * @param sourcePicture  the picture object to copy
   */
  public void copyPicture(SimplePicture sourcePicture) {
    Pixel sourcePixel = null;
    Pixel targetPixel = null;
    
    // loops through the columns
    for (int sourceX = 0, targetX = 0; 
         sourceX < sourcePicture.getWidth() && targetX < this.getWidth();
         sourceX++, targetX++) {
      // loops through the rows
      for (int sourceY = 0, targetY = 0; 
           sourceY < sourcePicture.getHeight() && 
           targetY < this.getHeight();
           sourceY++, targetY++) {
        sourcePixel = sourcePicture.getPixel(sourceX,sourceY);
        targetPixel = this.getPixel(targetX,targetY);
        targetPixel.setColor(sourcePixel.getColor());
      }
    }
    
  }
  
  /**
   * Sets the color in the picture to the passed color
   * @param color  the color to set to
   */
  public void setAllPixelsToAColor(Color color) {
    // loops through all x
    for (int x = 0; x < this.getWidth(); x++) {
      // loops through all y
      for (int y = 0; y < this.getHeight(); y++) {
        getPixel(x,y).setColor(color);
      }
    }
  }
  
  /**
   * Gets the buffered image.
   * 
   * @return  the buffered image 
   */
  public BufferedImage getBufferedImage() {
    return bufferedImage;
  }
  
  /**
   * Gets a graphics object for this picture to use to draw on.
   * 
   * @return  a graphics object to use for drawing
   */
  public Graphics getGraphics() {
    return bufferedImage.getGraphics();
  }
  
  /**
   * Gets a Graphics2D object for this picture which can
   * be used to do 2D drawing on the picture.
   * 
   * @return  Graphics2D object for this picture
   */
  public Graphics2D createGraphics() {
    return bufferedImage.createGraphics();
  }
  
  /**
   * Gets the file name associated with the picture.
   * 
   * @return  the file name associated with the picture
   */
  public String getFileName() {
    return fileName;
  }
  
  /**
   * Sets the file name.
   * 
   * @param name  the full pathname of the file
   */
  public void setFileName(String name) {
    fileName = name;
  }
  
  /**
   * Gets the title of the picture.
   * 
   * @return  the title of the picture
   */
  public String getTitle() {
    return title;
  }
  
  /**
   * Sets the title for the picture.
   * 
   * @param title  the title to use for the picture
   */
  public void setTitle(String title) {
    this.title = title;
    if (pictureFrame != null)
      pictureFrame.setTitle(title);
  }
  
  /**
   * Gets the width of the picture in pixels.
   * 
   * @return  the width of the picture in pixels
   */
  public int getWidth() {
    return bufferedImage.getWidth();
  }
  
  /**
   * Gets the height of the picture in pixels.
   * 
   * @return  the height of the picture in pixels
   */
  public int getHeight() {
    return bufferedImage.getHeight(); 
  }
  
  /**
   * Gets the picture frame for the picture.
   * 
   * @return  the picture frame associated with this picture (it may be null)
   */
  public PictureFrame getPictureFrame() { 
    return pictureFrame; 
  }
  
  /**
   * Sets the picture frame for this picture.
   * 
   * @param pictureFrame  the picture frame to use 
   */
  public void setPictureFrame(PictureFrame pictureFrame) {
    // sets this picture objects' picture frame to the passed one
    this.pictureFrame = pictureFrame;
  }
  
  /**
   * Gets an image from the picture.
   * 
   * @return  the buffered image since it is an image
   */
  public Image getImage() {
    return bufferedImage;
  }
  
  /**
   * Returns the pixel value as an int for the given x and y location.
   * 
   * @param x  the x coordinate of the pixel
   * @param y  the y coordinate of the pixel
   * @return   the pixel value as an integer (alpha, red, green, blue)
   */
  public int getBasicPixel(int x, int y) {
    return bufferedImage.getRGB(x,y);
  }
  
  /** 
   * Sets the value of a pixel in the picture from an int.
   * @param x    the x coordinate of the pixel
   * @param y    the y coordinate of the pixel
   * @param rgb  the new rgb value of the pixel (alpha, red, green, blue)
   */     
  public void setBasicPixel(int x, int y, int rgb) {
    bufferedImage.setRGB(x,y,rgb);
  }
  
  /**
   * Gets a pixel object for the given x and y location.
   * @param x  the x location of the pixel in the picture
   * @param y  the y location of the pixel in the picture
   * @return   a Pixel object for this location
   */
  public Pixel getPixel(int x, int y) {
    // creates the pixel object for this picture and the given x and y location
    Pixel pixel = new Pixel(this,x,y);
    return pixel;
  }
  
  /**
   * Gets a one-dimensional array of Pixels for this simple picture.
   * 
   * @return  a one-dimensional array of Pixel objects starting with y=0
   *          to y=height-1 and x=0 to x=width-1
   */
  public Pixel[] getPixels() {
    int width = getWidth();
    int height = getHeight();
    Pixel[] pixelArray = new Pixel[width * height];
    
    // loops through height rows from top to bottom
    for (int row = 0; row < height; row++) 
      for (int col = 0; col < width; col++) 
      pixelArray[row * width + col] = new Pixel(this,col,row);
    
    return pixelArray;
  }
  
  /**
   * Gets a two-dimensional array of Pixels for this simple picture.
   * 
   * @return  a two-dimensional array of Pixel objects in row-major order
   */
  public Pixel[][] getPixels2D() {
    int width = getWidth();
    int height = getHeight();
    Pixel[][] pixelArray = new Pixel[height][width];
    
    // loops through height rows from top to bottom
    for (int row = 0; row < height; row++) 
      for (int col = 0; col < width; col++) 
      pixelArray[row][col] = new Pixel(this,col,row);
    
    return pixelArray;
  }
  
  /**
   * Loads the buffered image with the passed image.
   * 
   * @param image  the image to use
   */
  public void load(Image image) {
    // gets a graphics context to use to draw on the buffered image
    Graphics2D graphics2d = bufferedImage.createGraphics();
    
    // draws the image on the buffered image starting at 0,0
    graphics2d.drawImage(image,0,0,null);
    
    // shows the new image
    show();
  }
  
  /**
   * Shows the picture in a picture frame.
   */
  public void show() {
    // if there is a current picture frame then uses it 
    if (pictureFrame != null)
      pictureFrame.updateImageAndShowIt();
    
    // else creates a new picture frame with this picture 
    else
      pictureFrame = new PictureFrame(this);
  }
  
  /**
   * Hides the picture display
   */
  public void hide() {
    if (pictureFrame != null)
      pictureFrame.setVisible(false);
  }
  
  /**
   * Makes this picture visible or not.
   * 
   * @param flag  true if you want it visible; else false
   */
  public void setVisible(boolean flag) {
    if (flag)
      this.show();
    else 
      this.hide();
  }
  
  /**
   * Opens a picture explorer on a copy (in memory) of this simple picture.
   */
  public void explore() {
    // creates a copy of the current picture and explores it
    new PictureExplorer(new SimplePicture(this));
  }
  
  /**
   * Forces the picture to repaint itself.  This is very useful after you have 
   * changed the pixels in a picture and you want to see the change.
   */
  public void repaint() {
    // if there is a picture frame, tells it to repaint
    if (pictureFrame != null)
      pictureFrame.repaint();
    
    // else creates a new picture frame
    else
      pictureFrame = new PictureFrame(this);
  }
  
  /**
   * Loads the picture from the passed file name.
   * 
   * @param fileName  the file name to use to load the picture from
   * @throws          IOException if the picture isn't found
   */
  public void loadOrFail(String fileName) throws IOException {
    // sets the current picture's file name
    this.fileName = fileName;
    
    // sets the extension
    int posDot = fileName.indexOf('.');
    if (posDot >= 0)
      this.extension = fileName.substring(posDot + 1);
    
    // if the current title is null uses the file name
    if (title == null)
      title = fileName;
    
    File file = new File(this.fileName);
    
    if (!file.canRead()) {
      // tries adding the media path 
      file = new File(FileChooser.getMediaPath(this.fileName));
      if (!file.canRead()) {
        throw new IOException(this.fileName +
                              " could not be opened. Check that you specified the path");
      }
    }
    
    bufferedImage = ImageIO.read(file);
  }
  
  /**
   * Reads the contents of the picture from a filename without throwing errors.
   * 
   * @param fileName  the name of the file to write the picture to
   * @return          true if success else false
   */
  public boolean load(String fileName) {
    try {
      this.loadOrFail(fileName);
      return true;  
    } catch (Exception ex) {
      System.out.println("There was an error trying to open " + fileName);
      bufferedImage = new BufferedImage(600,200, BufferedImage.TYPE_INT_RGB);
      addMessage("Couldn't load " + fileName,5,100);
      return false;
    }
    
  }
  
  /**
   * Loads the picture from the passed file name.  This just calls
   * load(fileName) and is for name compatibility.
   * 
   * @param fileName  the file name to use to load the picture from
   * @return          true if success; else false
   */
  public boolean loadImage(String fileName)
  {
    return load(fileName);
  }
  
  /**
   * Draws a message as a string on the buffered image.
   *  
   * @param message  the message to draw on the buffered image
   * @param xPos     the leftmost point of the string in x 
   * @param yPos     the bottom of the string in y
   */
  public void addMessage(String message, int xPos, int yPos) {
    // gets a graphics context to use to draw on the buffered image
    Graphics2D graphics2d = bufferedImage.createGraphics();
    
    // sets the color to white
    graphics2d.setPaint(Color.white);
    
    // sets the font to Helvetica bold style and size 16
    graphics2d.setFont(new Font("Helvetica",Font.BOLD,16));
    
    // draws the message
    graphics2d.drawString(message,xPos,yPos);
    
  }
  
  /**
   * Draws a string at the given location on the picture.
   * 
   * @param text  the text to draw
   * @param xPos  the left x for the text 
   * @param yPos  the top y for the text
   */
  public void drawString(String text, int xPos, int yPos) {
    addMessage(text,xPos,yPos);
  }
  
  /**
   * Creates a new picture by scaling the current picture by the given.
   * 
   * @param rFactor  the amount to scale in the height (rows)
   * @param cFactor  the amount to scale in the width (columns)
   * @return         the resulting picture
   */
  public Picture scale(double rFactor, double cFactor) {
    // sets up the scale tranform
    AffineTransform scaleTransform = new AffineTransform();
    scaleTransform.scale(cFactor,rFactor);
    
    // creates a new picture object that is the right size
    Picture result = new Picture((int) (getHeight() * rFactor), (int) (getWidth() * cFactor));
    
    // gets the graphics 2d object to draw on the result
    Graphics graphics = result.getGraphics();
    Graphics2D g2 = (Graphics2D) graphics;
    
    // draws the current image onto the result image scaled
    g2.drawImage(this.getImage(),scaleTransform,null);
    
    return result;
  }
  
  /**
   * Creates a new picture of the passed width. 
   * The aspect ratio of the width and height will stay the same.
   * 
   * @param width  the desired width
   * @return       the resulting picture
   */
  public Picture getPictureWithWidth(int width) {
    // sets up the scale tranform
    double xFactor = (double) width / this.getWidth();
    Picture result = scale(xFactor,xFactor);
    return result;
  }
  
  /**
   * Creates a new picture of the passed height. 
   * The aspect ratio of the width and height will stay the same.
   * @param height  the desired height
   * @return        the resulting picture
   */
  public Picture getPictureWithHeight(int height) {
    // sets up the scale tranform
    double yFactor = (double) height / this.getHeight();
    Picture result = scale(yFactor,yFactor);
    return result;
  }
  
  /**
   * Loads a picture from a file name and shows it in a picture frame.
   * 
   * @param fileName  the file name to load the picture from
   * @return          true if success; else false
   */
  public boolean loadPictureAndShowIt(String fileName) {
    boolean result = true;  // the default is that it worked
    
    // tries to load the picture into the buffered image from the file name
    result = load(fileName);
    
    // shows the picture in a picture frame
    show();
    
    return result;
  }
  
  /**
   * Writes the contents of the picture to a file with the passed name
   * 
   * @param fileName  the name of the file to write the picture to
   * @throws          IOException
   *                  thrown if file cannot be written to location
   */
  public void writeOrFail(String fileName) throws IOException {
    String extension = this.extension; // the default is current
    
    // creates the file object
    File file = new File(fileName);
    File fileLoc = file.getParentFile(); // directory name
    
    // if there is no parent directory, uses the current media dir
    if (fileLoc == null) {
      fileName = FileChooser.getMediaPath(fileName);
      file = new File(fileName);
      fileLoc = file.getParentFile(); 
    }
    
    // checks that you can write to the directory 
    if (!fileLoc.canWrite()) {
      throw new IOException(fileName +
                            " could not be opened. Check to see if you can write to the directory.");
    }
    
    // gets the extension
    int posDot = fileName.indexOf('.');
    if (posDot >= 0)
      extension = fileName.substring(posDot + 1);
    
    // writes the contents of the buffered image to the file as jpeg
    ImageIO.write(bufferedImage, extension, file);
    
  }
  
  /**
   * Writes the contents of the picture to a file with the passed name without throwing errors.
   * 
   * @param fileName  the name of the file to write the picture to
   * @return          true if success; else false
   */
  public boolean write(String fileName) {
    try {
      this.writeOrFail(fileName);
      return true;
    } catch (Exception ex) {
      System.out.println("There was an error trying to write " + fileName);
      ex.printStackTrace();
      return false;
    }
    
  }
  
  /**
   * Gets the directory for the media.
   * 
   * @param fileName  the base file name to use
   * @return          the full path name by appending the file name to the media directory
   */
  public static String getMediaPath(String fileName) {
    return FileChooser.getMediaPath(fileName);
  }
  
  /**
   * Gets the coordinates of the enclosing rectangle after this
   * transformation is applied to the current picture.
   * 
   * @param trans  the transformation
   * @return       the enclosing rectangle
   */
  public Rectangle2D getTransformEnclosingRect(AffineTransform trans) {
    int width = getWidth();
    int height = getHeight();
    double maxX = width - 1;
    double maxY = height - 1;
    double minX, minY;
    Point2D.Double p1 = new Point2D.Double(0,0);
    Point2D.Double p2 = new Point2D.Double(maxX,0);
    Point2D.Double p3 = new Point2D.Double(maxX,maxY);
    Point2D.Double p4 = new Point2D.Double(0,maxY);
    Point2D.Double result = new Point2D.Double(0,0);
    Rectangle2D.Double rect = null;
    
    // gets the new points and min x and y and max x and y
    trans.deltaTransform(p1,result);
    minX = result.getX();
    maxX = result.getX();
    minY = result.getY();
    maxY = result.getY();
    trans.deltaTransform(p2,result);
    minX = Math.min(minX,result.getX());
    maxX = Math.max(maxX,result.getX());
    minY = Math.min(minY,result.getY());
    maxY = Math.max(maxY,result.getY());
    trans.deltaTransform(p3,result);
    minX = Math.min(minX,result.getX());
    maxX = Math.max(maxX,result.getX());
    minY = Math.min(minY,result.getY());
    maxY = Math.max(maxY,result.getY());
    trans.deltaTransform(p4,result);
    minX = Math.min(minX,result.getX());
    maxX = Math.max(maxX,result.getX());
    minY = Math.min(minY,result.getY());
    maxY = Math.max(maxY,result.getY());
    
    // creates the bounding rectangle to return
    rect = new Rectangle2D.Double(minX,minY,maxX - minX + 1, maxY - minY + 1);
    return rect;
  }
  
  /**
   * Gets the coordinates of the enclosing rectangle after this
   * transformation is applied to the current picture.
   * 
   * @param trans  the transformation
   * @return       the enclosing rectangle
   */
  public Rectangle2D getTranslationEnclosingRect(AffineTransform trans) {
    return getTransformEnclosingRect(trans);
  }
  
  /**
   * Returns a string with information about this picture.
   * 
   * @return  a string with information about the picture 
   */
  public String toString() {
    String output = "Simple Picture, filename " + fileName + 
      " height " + getHeight() + " width " + getWidth();
    return output;
  }
  
}