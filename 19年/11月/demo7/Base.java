package demo7;

public interface Base {
    public final static String SMALL = "小杯";
    public final static String MIDDLE = "中杯";
    public final static String BIG = "大杯";

    double computedPrice();

    void add(double addPrice);
}
