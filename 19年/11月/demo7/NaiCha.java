package demo7;

public class NaiCha implements Base {
    private String mark;

    private double price;

    public NaiCha() {
        this.price = 10;
    }

    public NaiCha(String mark) {
        this.mark = mark;
        this.price = 10;
    }


    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }


    @Override
    public double computedPrice() {
        return this.price;
    }

    @Override
    public void add(double addPrice) {
        this.price += addPrice;
    }
}
