/**
 * ReviewAnalysisTester contains a main method to test a ReviewAnalysis object.
 * 
 * The tester constructs a ReviewAnalysis object, invokes the getAverageRating
 * and collectComments methods, and prints the results.
 */
public class ReviewAnalysisTester {
  public static void main(String[] args) {
    ReviewAnalysis myAnalysis = new ReviewAnalysis();
    System.out.println(myAnalysis.getAverageRating());
    System.out.println(myAnalysis.collectComments());
  }
}