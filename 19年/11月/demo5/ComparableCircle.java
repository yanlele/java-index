package demo5;

public class ComparableCircle extends Circle implements CompareObject<ComparableCircle> {
    public ComparableCircle(Double radius) {
        super(radius);
    }

    @Override
    public int compareTo(ComparableCircle o) {
        if (this.getArea().equals(o.getArea())) {
            return 0;
        } else if (this.getArea() > o.getArea()) {
            return 1;
        } else {
            return -1;
        }
    }
}
