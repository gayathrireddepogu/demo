package Task28;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");

        System.out.println("Elements in the ArrayList:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        fruits.add(1, "Grapes");
        fruits.set(3, "Pineapple");
        fruits.remove("Banana");

        System.out.println("\nUpdated Elements in the ArrayList:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        System.out.println("\nTraversing the ArrayList using Iterator:");
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        if (fruits.contains("Mango")) {
            System.out.println("\nThe ArrayList contains Mango.");
        }
        System.out.println("\nSize of the ArrayList: " + fruits.size());

        fruits.clear();
        if (fruits.isEmpty()) {
            System.out.println("\nThe ArrayList is empty.");
        }
    }
}

