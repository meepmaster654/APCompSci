import java.lang.Math;

public class NumberPair {
    private double num1, num2;

    public NumberPair(double inum1, double inum2) {
        num1 = inum1;
        num2 = inum2;
    }

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public double calculateArithmeticMean() {
        return ((num1 + num2) / 2);
    }

    public double calculateGeometricMean() {
        return Math.sqrt(num1 * num2);
    }

    public double calculateHypotenuse() {
        return Math.hypot(num1, num2);
    }

    public boolean isMadeOfInts() {
        int oneInt = (int) num1;
        int twoInt = (int) num2;
        if (oneInt == num1 && twoInt == num2) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        String output = "";

        if (num1 <= num2) {
            output += (num1 + "," + num2 + "\n");
        } else {
            output += (num2 + "," + num1 + "\n");
        }
        output += "The arithmetic mean is " + calculateArithmeticMean() + "\n";
        output += "The geometric mean is " + calculateGeometricMean() + "\n";
        output += "The hypotenuse is " + calculateHypotenuse() + "\n";
        return output;
    }
}
