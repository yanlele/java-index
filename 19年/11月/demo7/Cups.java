package demo7;

public enum Cups {
    SMALL(2, "小杯"),
    MIDDLE(4, "中杯"),
    BIG(6, "大杯")
    ;
    private double AddPrice;
    private String message;

    Cups(double addPrice, String message) {
        AddPrice = addPrice;
        this.message = message;
    }

    public double getAddPrice() {
        return AddPrice;
    }

    public void setAddPrice(double addPrice) {
        AddPrice = addPrice;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
