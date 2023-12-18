package Task31;

public class Arrayreverse {

    public static void reverse(int[] array) {
        int start = 0;
        int end = array.length - 1;

        while (start < end) {

            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        
        System.out.println("Original Array:");
        printArray(originalArray);

        reverse(originalArray);

        System.out.println("Reversed Array:");
        printArray(originalArray);
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
