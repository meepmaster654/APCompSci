import java.util.Scanner;

public class ExtraLife {
    double amount;
    String name, message;
    boolean extra;

    public double getAmount() {
        return amount;
    }

    public String getMessage() {
        return message;
    }

    public String getName() {
        return name;
    }

    public ExtraLife(double amount, String name, String message) {
        this.amount = amount;
        this.name = name;
        this.message = message;
    }

    public ExtraLife(double amount, String name) {
        this.amount = amount;
        this.name = name;
    }

    public ExtraLife(double amount) {
        this.amount = amount;
        name = "Anonymous";
    }

    public void coverServiceFee(boolean cover) {
        this.extra = cover;
        if (cover) {
            this.amount += 3.50;
        }
    }

    public void coverServiceFee() {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("How much of the $3.50 service fee will you cover");
            double feeCover = input.nextDouble();
            this.amount += feeCover;
        }
        this.extra = true;
    }

    @Override
    public String toString() {
        if (extra) {
            return "Thank you " + name + " for your donation of $" + amount
                    + " and thank you for covering the Service Fee";
        }
        return "Thank you " + name + " for your donation of $" + amount;

    }

}
