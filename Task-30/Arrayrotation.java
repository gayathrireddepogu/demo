package Task30;

public class Arrayrotation {

	    public static void main(String[] args) {

	        int[] binaryArray = {0, 1, 1, 0, 1, 0, 0, 1, 0, 1};

	        sortBinaryArray(binaryArray);

	        System.out.print("Sorted Binary Array: ");
	        for (int num : binaryArray) {
	            System.out.print(num + " ");
	        }
	    }

	    private static void sortBinaryArray(int[] arr) {
	        int countZeros = 0;

	        for (int num : arr) {
	            if (num == 0) {
	                countZeros++;
	            }
	        }

	        for (int i = 0; i < countZeros; i++) {
	            arr[i] = 0;
	        }
	        for (int i = countZeros; i < arr.length; i++) {
	            arr[i] = 1;
	        }
	    }
	}
