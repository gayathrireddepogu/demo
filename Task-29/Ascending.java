package Task29;


import java.util.Arrays;

public class Ascending {

	public static void main(String[] args) {
		int []array = new int[] {23,45,76,43};
		Arrays.sort(array);
		System.out.println("ascending order");
		
		for(int i =0;i<= array.length ; i++)
		{
			System.out.println(array[i]);
		}
	}

}