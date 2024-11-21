public class CombinedTable {
    SingleTable t1, t2;

    public CombinedTable(SingleTable t1, SingleTable t2) {
        this.t1 = t1;
        this.t2 = t2;
    }

    public boolean canSeat(int ppl) {
        return t1.getNumSeats() + t2.getNumSeats() >= ppl;
    }

    public double getDesirability() {
        if (t1.getHeight() == t2.getHeight()) {
            return (t1.getViewQuality() + t2.getViewQuality()) / 2;
        } else {
            return (t1.getViewQuality() + t2.getViewQuality()) / 2 - 10;
        }
    }
}
