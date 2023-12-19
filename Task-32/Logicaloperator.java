package Task32;

public class Logicaloperator {

	public static void main(String[] args) {
		int x = 5;
		int y = 10;

		if (x > 0 && y > 0) {
		    System.out.println("Both x and y are positive.");
		} else if (x > 0 || y > 0) {
		    System.out.println("At least one of x or y is positive.");
		} else {
		    System.out.println("Both x and y are non-positive.");
		}



	}

}
