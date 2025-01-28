/**
 * OutOfBounds contains a main method to demonstrate common errors in declaring,
 * instantiating, populating, and reading arrays.
 */
public class OutOfBounds {
  public static void main(String[] args) {
    // creates and fills three lists
    boolean[] bList = {true, false, true, false, true};
    int[] iList = {3, 5, 1, 8, 2, 10};
    double[] dList = {4.0, 5.0, 2.6, 3.6, 3.9};
    
    // creates (but leaves empty) two lists
    String[] sList = new String[3];
    int[] iList2 = new int[4];
    
    // changes second item of bList to true
    bList[1] = true;
    
    // changes fourth item of iList to 5
    iList[3] = 5;
    
    // changes first item of dList to 8.9
    dList[0] = 8.9;
    
    // sets a variable x equal to the last item of iList
    int x = iList[iList.length - 1] ;
    
    // fills sList with the letters "h", "e", and "y"
    sList[0] = "h";
    sList[1] = "e";
    sList[2] = "y";
    
    // fills iList2 with the numbers 5 to 8
    int count = 5;
    for (int i = 0; i <= 3; i++) {
      iList2[i] = count;
      count++;
    }
    
    
    // NO ERRORS TO FIX BELOW THIS LINE --------------------------------------------------------------------------------
    // -----------------------------------------------------------------------------------------------------------------
    // confirms all changes worked
    // bList
    for (int i = 0; i < bList.length; i++) {
      System.out.println(bList[i]);
    }
    System.out.println();
    
    // iList
    for (int i = 0; i < iList.length; i++) {
      System.out.println(iList[i]);
    }
    System.out.println();
    
    // dList
    for (int i = 0; i < dList.length; i++) {
      System.out.println(dList[i]);
    }
    System.out.println();
    
    // sList
    for (int i = 0; i < sList.length; i++) {
      System.out.println(sList[i]);
    }
    System.out.println();
    
    // iList2
    for (int i = 0; i < iList2.length; i++) {
      System.out.println(iList2[i]);
    }
    System.out.println();

    // last item in iList
    System.out.println("The last item in iList is " + x + ".");

  }
}