package Task32;

public class MathExample {
    public static void main(String[] args) {

        double number = 25.0;
        double squareRoot = Math.sqrt(number);
        System.out.println("Square root of " + number + " is: " + squareRoot);

        double base = 2.0;
        double exponent = 3.0;
        double result = Math.pow(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);

        double angle = 45.0;
        double sineValue = Math.sin(Math.toRadians(angle));
        System.out.println("Sine value of " + angle + " degrees is: " + sineValue);
    }
}
