package Task33;

import java.util.ArrayList;
import java.util.Arrays;

public class Array2dlist {
    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> twoDList = new ArrayList<>();

        twoDList.add(new ArrayList<>(Arrays.asList(1, 2, 3)));
        twoDList.add(new ArrayList<>(Arrays.asList(4, 5, 6)));
        twoDList.add(new ArrayList<>(Arrays.asList(7, 8, 9)));

        int element = twoDList.get(1).get(2);
        System.out.println("Element at row 1, column 2: " + element);

        twoDList.get(0).set(1, 20);

        System.out.println("Iterating through the 2D ArrayList:");
        for (ArrayList<Integer> row : twoDList) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
