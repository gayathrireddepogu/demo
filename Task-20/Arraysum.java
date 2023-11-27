package Task20;

public class Arraysum {

    public static int calculateSum(int[] array) {
        int sum = 0;
        for (int element : array) {
            sum += element;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int sum = calculateSum(array);

        System.out.println("Array: " + java.util.Arrays.toString(array));
        System.out.println("Sum of elements: " + sum);
    }
}
