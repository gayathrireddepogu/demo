package Task29;


public class Duplicate {

    public static void main(String[] args) {
        int[] array = new int[] {23, 45, 76, 43,43,76,3,2,3,4,3,43,4,5,4,5,7};

        System.out.println("Duplicate elements:");

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println(array[j]);
                }
            }
        }
    }
}

