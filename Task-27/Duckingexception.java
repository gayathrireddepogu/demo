package Task27;

public class Duckingexception {
    public static void main(String[] args) {
        try {

            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException ignored) {

            System.out.println("An exception occurred, but we're ignoring it.");
        }

        System.out.println("Program continues...");
    }

    private static int divide(int num1, int num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return num1 / num2;
    }
}

