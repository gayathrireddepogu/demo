package Task28;

import java.util.*;

public class Mapinjava {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Amit");
        map.put(5, "Rahul");
        map.put(2, "Jai");
        map.put(6, "Amit");

        Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
        Iterator<Map.Entry<Integer, String>> iterator = entrySet.iterator();

        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
