/**
 * ClubMembersTester contains a main method to test a ClubMembers object.
 * 
 * The tester constructs various MemberInfo objects and a ClubMembers object,
 * invokes the addMembers and removeMembers methods, and prints the results.
 */
public class ClubMembersTester {
  public static void main(String[] args) {
    // initial setup
    ClubMembers computerClub = new ClubMembers();
    String[] members19 = {"SMITH, JANE", "LOVELACE, ADA"};
    computerClub.addMembers(members19, 2019);
    String[] members18 = {"FOX, STEVE "};
    computerClub.addMembers(members18, 2018);
    String[] members17 = {"XIN, MICHAEL", "HOPPER, GRACE"};
    computerClub.addMembers(members17, 2017);
    String[] members20 = {"GARCIA, MARIA"};
    computerClub.addMembers(members20, 2020);
    
    // changes standing of the following three members
    String[] standingChanges = {"SMITH, JANE", "LOVELACE, ADA", "XIN, MICHAEL"}; 
    computerClub.changeStandings(standingChanges);
    System.out.println(computerClub);
    
    // invokes removeMembers method and prints the return value of the method
    System.out.println("Removed members (graduated and in good standing):\n" + computerClub.removeMembers(2018));
    
    // prints the remaining members after invocation of removeMembers method above
    System.out.println("\nCurrent (ungraduated) members:\n" + computerClub);
  }
  
}