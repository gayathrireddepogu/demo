package Task32;

public class Array2d {
    public static void main(String[] args) {

        int[][] dynamicMatrix = new int[3][];
        dynamicMatrix[0] = new int[2];
        dynamicMatrix[1] = new int[3];
        dynamicMatrix[2] = new int[4];
        dynamicMatrix[0][1] = 42;
        System.out.println("Element at dynamicMatrix[0][1]: " + dynamicMatrix[0][1]); 
    }
}

