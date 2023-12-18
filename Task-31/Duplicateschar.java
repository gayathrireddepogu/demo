package Task31;

import java.util.HashMap;
import java.util.Map;

public class Duplicateschar {

    public static void findDuplicateAndCount(String str) {

        Map<Character, Integer> charFrequency = new HashMap<>();

        for (char ch : str.toCharArray()) {

            charFrequency.put(ch, charFrequency.getOrDefault(ch, 0) + 1);
        }

        System.out.println("Duplicate characters and their counts:");
        for (Map.Entry<Character, Integer> entry : charFrequency.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }

    public static void main(String[] args) {
        String inputString = "programming";

        findDuplicateAndCount(inputString);
    }
}

