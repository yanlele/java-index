package demo7;

public enum Append {
    sugar(2, "加糖"),
    fruit(3, "椰果"),
    milk(5, "牛奶")
    ;
    Append(double price, String message) {
        this.price = price;
        this.message = message;
    }

    private double price;
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
