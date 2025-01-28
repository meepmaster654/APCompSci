//Will Leasure
public class HourlyShift implements Job {
  private static int weeklyHours;
  private static double totalPay;
  private int hours;
  private double rate;
  public HourlyShift(int hours, double rate) {
    this.hours = hours;
    this.rate = rate;
    if (weeklyHours + hours <= 40) {
      updateWithRegularPay();
    } else {
      updateWithOvertimePay();
    }
    
  }
  public void updateWithRegularPay() {
    totalPay += hours * rate;
    weeklyHours += hours;
  }
  public void updateWithOvertimePay() {
    int regHours = 40 - weeklyHours;
    totalPay += regHours * rate;
    hours -= regHours;
    totalPay += hours * rate * 1.5;
    weeklyHours += hours;
    weeklyHours += regHours;
  }
  public static int getWeeklyHours() {
    return weeklyHours;
  }
  public static double getTotalPay() {
    return totalPay;
  }
  public String toString() {
    return "Hours: " + hours + " Rate: " + rate + " Weekly Hours: " + weeklyHours + " Total Pay: " + totalPay;
  }
}