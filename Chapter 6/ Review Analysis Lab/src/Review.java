/**
 * A review contains a rating and a comment.
 */
public class Review {
  private int rating;
  private String comment;

  /**
   * Initializes the rating and the comment of this review.
   * Precondition: r >= 0
   * c is not null
   *
   * @param r the rating of this review
   * @param c the comment of this review
   */
  public Review(int r, String c) {
    rating = r;
    comment = c;
  }

  /**
   * Returns the rating of this review.
   * 
   * @return the rating
   */
  public int getRating() {
    return rating;
  }

  /**
   * Returns the comment of this review.
   * 
   * @return the comment
   */
  public String getComment() {
    return comment;
  }

}