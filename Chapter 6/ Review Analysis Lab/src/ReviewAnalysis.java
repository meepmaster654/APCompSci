import java.util.ArrayList;

/**
 * ReviewAnalysis contains methods to analyze reviews, namely to find the
 * average rating and to collect comments.
 */
public class ReviewAnalysis {
  /** All user reviews to be included in this analysis. */
  private Review[] allReviews;

  /**
   * Initializes allReviews to contain all the Review objects to be analyzed.
   * Not implemented in the original AP question.
   */
  public ReviewAnalysis() {
    // This implementation is not very realistic, but is sufficient to replicate
    // the example in the lab description.
    allReviews = new Review[5];
    allReviews[0] = new Review(4, "Good! Thx");
    allReviews[1] = new Review(3, "OK site");
    allReviews[2] = new Review(5, "Great!");
    allReviews[3] = new Review(2, "Poor! Bad.");
    allReviews[4] = new Review(3, "");
  }

  /**
   * Returns a double representing the average rating of all the Review objects to
   * be analyzed, as described in part (a).
   * Precondition: allReviews contains at least one Review.
   * 
   * @return the average rating of all reviews being analyzed
   */
  public double getAverageRating() {
    double ave = 0;
    for (Review i : allReviews) {
      ave += i.getRating();
    }
    ave /= allReviews.length;
    return ave;
  }

  /**
   * Returns an ArrayList of String objects containing formatted versions of
   * selected user comments, as described in part (b).
   * 
   * @return a list of strings of comments that have been formatted
   */
  public ArrayList<String> collectComments() {
    ArrayList<String> out = new ArrayList<String>();
    for (int i = 0; i < allReviews.length; i++) {

      if (allReviews[i].getComment().indexOf("!") != -1) {
        if (allReviews[i].getComment().substring(allReviews[i].getComment().length() - 1).equals("!")
            || allReviews[i].getComment().substring(allReviews[i].getComment().length() - 1).equals(".")) {
          out.add(i + "-" + allReviews[i].getComment());
        } else {
          out.add(i + "-" + allReviews[i].getComment() + ".");
        }
      }
    }
    return out;
  }

}