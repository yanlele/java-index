package demo7;

public class TestBeverage {

    public static void main(String[] args) {
        NaiCha naiCha = new NaiCha("不要冰");
        naiCha.add(Append.milk.getPrice());
        naiCha.add(Append.fruit.getPrice());
        System.out.println("结账: " + naiCha.computedPrice());
    }
}
