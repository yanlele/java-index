package demo3;

public class MOL {
    public MOL() {
    }

    public static void main(String[] args) {
        System.out.println(MOL.mol(5));
        System.out.println(MOL.mol(5, 10));
        System.out.println(MOL.mol("CallMOL"));
    }

    private static int mol(int a) {
        return a * a;
    }

    private static int mol(int a, int b) {
        return a * b;
    }

    private static String mol(String str) {
        return str;
    }
}
