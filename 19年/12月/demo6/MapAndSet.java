package demo6;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapAndSet {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("1", "yanle");
        map.put("2", "hudie");

        Set<String> set = map.keySet();
        for (String str: set) {
            System.out.println(map.get(str));
        }
    }
}
