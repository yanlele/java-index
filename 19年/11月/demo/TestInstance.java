package demo;

public class TestInstance {
    public static void main(String[] args) {
        System.out.println(method1(new Person()));
        System.out.println(method1(new Student()));
        System.out.println(method1(new Graduate()));
    }

    private static String method1(Person e) {
        return e.getInfo();
    }
}
