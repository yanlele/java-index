package demo5;

public class ComparableRectangle extends Rectangle implements CompareObject<ComparableRectangle> {

    public ComparableRectangle(int width, int height) {
        super(width, height);
    }

    @Override
    public int compareTo(ComparableRectangle o) {
        if (this.getArea() == o.getArea()) {
            return 0;
        } else if (this.getArea() > o.getArea()) {
            return 1;
        } else {
            return -1;
        }
    }
}
