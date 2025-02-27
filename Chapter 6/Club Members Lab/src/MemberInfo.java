/**
 * Member info is comprised of a club member's name, graduation year, and
 * standing.
 */
public class MemberInfo {
  private String name = null;
  private int gradYear = 0;
  private boolean hasGoodStanding = false;

  /**
   * Constructs a MemberInfo object for the club member with name, graduation
   * year, and standing.
   * Not implemented in original AP question.
   * 
   * @param name            the name of the club member
   * @param gradYear        the graduation year of the club member
   * @param hasGoodStanding true if the club member has fulfilled the
   *                        responsibilities of club membership;
   *                        false otherwise
   */
  public MemberInfo(String name, int gradYear, boolean hasGoodStanding) {
    this.name = name;
    this.gradYear = gradYear;
    this.hasGoodStanding = hasGoodStanding;
  }

  /**
   * Returns the name of the club member.
   * Not included in the original AP question.
   * 
   * @return the name of the club member
   */
  public String getName() {
    return name;
  }

  /**
   * Returns the graduation year of the club member.
   * Not implemented in the original AP question.
   * 
   * @return the graduation year of the club member
   */
  public int getGradYear() {
    return gradYear;
  }

  /**
   * Returns true if the member is in good standing and false otherwise.
   * Not implemented in the original AP question.
   * 
   * @return true if the club member has fulfilled the responsibilities of club
   *         membership;
   *         false otherwise
   */
  public boolean inGoodStanding() {
    return hasGoodStanding;
  }

  /**
   * Changes standing for the club member. If previously false, standing is
   * changed to true. If previously true, standing is changed to false.
   * Not included in the original AP question.
   */
  public void changeStanding() {
    hasGoodStanding = !hasGoodStanding;
  }

  /**
   * Returns this member's name, graduation year, and standing as a string.
   * Not included in the original AP question.
   * 
   * @return a string representation of the object
   */
  public String toString() {
    return name + "\t" + gradYear + "\t" + hasGoodStanding;
  }

}
