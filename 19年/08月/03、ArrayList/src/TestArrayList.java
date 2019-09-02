package src;

import java.util.LinkedList;

public class TestArrayList {
    public static void main(String[] args) {
        LinkedList<String> cityList = new LinkedList<>();
        cityList.add("London");
        cityList.add("Denver");
        cityList.add("Paris");
        cityList.add("Miami");
        cityList.add("Seoul");
        cityList.add("Tokyo");

        System.out.println("size " + cityList.size());
        System.out.println("is miami in the list? " + cityList.contains("Miami"));
        System.out.println("The location of Denver in the list？ " + cityList.indexOf("Denver"));
        System.out.println("is the list empty? " + cityList.isEmpty());

        cityList.add(2, "Xian");
        System.out.println(cityList);

        cityList.remove("Miami");
        System.out.println(cityList);

        System.out.println(cityList.toString());

        for (int i = cityList.size() - 1; i >= 0; i--) {
            System.out.println(cityList.get(i));
        }

    }
}
