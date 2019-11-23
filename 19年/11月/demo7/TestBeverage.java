package demo7;

public class TestBeverage {

    public static void main(String[] args) {
        NaiCha naiCha = new NaiCha("不要冰");
        naiCha.add(Append.milk.getPrice());
        naiCha.add(Append.fruit.getPrice());
        System.out.println("结账: " + naiCha.computedPrice());

        NaiCha naiCha2 = new NaiCha("常温", Base.BIG);
        naiCha2.add(Append.milk.getPrice());
        naiCha2.add(Append.fruit.getPrice());
        System.out.println("结账: " + naiCha2.computedPrice());


    }
}
