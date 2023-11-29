package Task22;

public class Methodoverloading {
    
    public int add(int a, int b) {
        return a + b;
    }
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    public double add(double a, double b) {
        return a + b;
    }
    public static void main(String[] args) {
        Methodoverloading math = new Methodoverloading();

        int sum1 = math.add(5, 10);
        System.out.println("Sum 1: " + sum1);

        int sum2 = math.add(5, 10, 15);
        System.out.println("Sum 2: " + sum2);

        double sum3 = math.add(2.5, 3.5);
        System.out.println("Sum 3: " + sum3);
    }
}
