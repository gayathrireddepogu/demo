package Task33;

import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println("Elements in the ArrayList: " + numbers);

        numbers.add(1, 15);

        numbers.remove(2);

        System.out.println("Elements after modifications: " + numbers);

        System.out.println("Iterating through the ArrayList:");
        for (int i : numbers) {
            System.out.println(i);
        }
    }
}
