/**
 * SkyViewTester contains a main method to test a SkyView object.
 * 
 * The tester constructs two objects, and prints them via the toString method.
 * The tester invokes the getAverage method.
 */
public class SkyViewTester {
  public static void main(String[] args) {
    // tests constructor
    double[] scan1 = {0.3, 0.7, 0.8, 0.4, 1.4, 1.1, 0.2, 0.5, 0.1, 1.6, 0.6, 0.9};
    SkyView nightSky = new SkyView(4, 3, scan1);
    System.out.println(nightSky);
    
    double[] scan2 = {0.3, 0.7, 0.8, 0.4, 1.4, 1.1};
    SkyView eveningSky = new SkyView(3, 2, scan2);
    System.out.println(eveningSky);
    
    // tests getAverage method
    System.out.println(nightSky.getAverage(1, 2, 0, 1));
  }
}