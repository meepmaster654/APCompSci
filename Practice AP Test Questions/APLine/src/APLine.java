public class APLine {
    private int a, b, c;

    public APLine(int ayy, int bee, int see) {
        a = ayy;
        b = bee;
        c = see;
    }

    public double getSlope() {
        return (-a / (double) b);
    }

    public boolean isOnLine(int x, int y) {
        return a * x + b * y + c == 0;
    }
}