package demo6;

import java.util.HashMap;
import java.util.Map;

/* java 复习题 - map */
public class Test1 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("1", "yanle");
        map.put("2", "huxie");

        System.out.println(map.keySet());
        System.out.println(map.get("1"));
        System.out.println(map.get("2"));

        // 遍历
        for(Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
