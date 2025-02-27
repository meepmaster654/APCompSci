public class Tile {
  boolean isMine;
  int state;
  int numNear;

  // STATE: 0 = hidden, 1 = shown (mine), 2 = shown (safe, nothing near), 3 = shown (safe, some near)
  public Tile(boolean isMine) {
    this.isMine = isMine;
    state = 0;
  }

  public void setState(int state) {
    this.state = state;
  }

  public void setNumNear(int numNear) {
    this.numNear = numNear;
  }

  public int getNumNear() {
    return numNear;
  }

  public boolean isMine() {
    return isMine;
  }

  public String toString() {
    switch (state) {
      case 1:
        return "X";
      case 2:
        return "0";
      case 3:
        return "" + numNear;
      default:
        return "#";
    }
  }

  public int getState() {
    return state;
  }
}
