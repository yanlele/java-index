public class TestAnimal {

    public static void main(String[] args) {
        Animal animal = new Animal("pipi", 1, 10000);

        animal.eat();
        System.out.println(animal.getWeight());
        animal.run();
        System.out.println(animal.getWeight());
    }
}
