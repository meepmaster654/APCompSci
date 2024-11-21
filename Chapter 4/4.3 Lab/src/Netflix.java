public class Netflix {
    String title;
    double rating;

    public Netflix(String title) {
        this.title = title;
    }

    public double getRating() {
        return rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
    public void setRating() {
        this.rating = 4;
    }

    public String toString() {
        return "Netflix Rating:" + rating + ", Title=" + title;
    }

    public boolean isPopular() {
        return rating >= 4;
    }
    public boolean isPopular(boolean promoted) {
        return (promoted && rating >= 2);
    }
}
