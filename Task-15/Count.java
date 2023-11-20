package Task15;

public class Count {

	public static void main(String[] args) {
		int count = 0, num = 0345;

	    while (num != 0) {
	      
	      num /= 10;
	      ++count;
	    }

	    System.out.println("Number of digits: " + count);
	  }
	

	}


