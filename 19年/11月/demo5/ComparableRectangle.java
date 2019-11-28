package demo5;

public class ComparableRectangle extends Rectangle implements CompareObject<ComparableRectangle> {

    public ComparableRectangle(int width, int height) {
        super(width, height);
    }

    @Override
    public int compareTo(ComparableRectangle o) {
        if (this.getArea() == o.getArea()) {
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
