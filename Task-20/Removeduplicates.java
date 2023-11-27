package Task20;

import java.util.Arrays;
import java.util.HashSet;

public class Removeduplicates {

    public static int[] removeDuplicates(int[] array) {
        // Use a HashSet to store unique elements
        HashSet<Integer> set = new HashSet<>();
        for (int element : array) {
            set.add(element);
        }

        // Convert the HashSet back to an array
        int[] result = new int[set.size()];
        int index = 0;
        for (int element : set) {
            result[index++] = element;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arrayWithDuplicates = {1, 2, 3, 4, 2, 5, 6, 7, 1, 8, 9, 10, 5};

        System.out.println("Original array: " + Arrays.toString(arrayWithDuplicates));

        int[] arrayWithoutDuplicates = removeDuplicates(arrayWithDuplicates);

        System.out.println("Array after removing duplicates: " + Arrays.toString(arrayWithoutDuplicates));
    }
}

