package demo7;

public class Juice implements Base {
    private String mark;
    private String type;

    private double price = 10;

    public Juice() {
        this.price += 2;
    }

    public Juice(String mark) {
        this.mark = mark;
        this.price += 2;
    }

    public Juice(String mark, String type) {
        this.mark = mark;
        this.type = type;

        switch (type) {
            case SMALL:
                this.price += Cups.SMALL.getAddPrice();
                break;
            case MIDDLE:
                this.price += Cups.MIDDLE.getAddPrice();
                break;
            case BIG:
                this.price += Cups.BIG.getAddPrice();
                break;
            default:
                break;
        }

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
