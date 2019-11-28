package demo5;

public class ComparableCircle extends Circle implements CompareObject<ComparableCircle> {
    public ComparableCircle(Double radius) {
        super(radius);
    }

    @Override
    public int compareTo(ComparableCircle o) {
        if (this.getArea().equals(o.getArea())) {
            System.out.println(0);
            return 0;
        } else if (this.getArea() > o.getArea()) {
            System.out.println(1);
            return 1;
        } else {
            System.out.println(-1);
            return -1;
        }
    }
}
