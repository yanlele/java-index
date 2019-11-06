public class TestAnimal {

    public static void main(String[] args) {
        Pets animal = new Pets("pipi", 1.0, 10000.0);

//        animal.eat();
        System.out.println(animal.getWeight());
        animal.run(3000.0);
        System.out.println(animal.getWeight());
    }
}
