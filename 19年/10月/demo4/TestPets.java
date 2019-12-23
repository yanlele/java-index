package demo4;

public class TestPets {
    public static void main(String[] args) {
        Pets pet1 = new Pets("dog", 1.0, 1000.0);
        System.out.println("当前的动物数量：" + Pets.counter);

        System.out.println("初始体重： " + pet1.getWeight());

        pet1.eat(2000.0);
        System.out.println("吃了东西之后的体重：" + pet1.getWeight());

        pet1.run(3000.0);
        System.out.println("跑了之后的体重： " + pet1.getWeight());

        System.out.println("创建第二只动物");
        Pets pet2 = new Pets("cat", 2.0, 1200.0);
        System.out.println("当前的动物数量：" + Pets.counter);
    }
}
