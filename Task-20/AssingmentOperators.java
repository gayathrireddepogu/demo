package Task20;

public class AssingmentOperators {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;

       
        int c = a;
        System.out.println("Simple Assignment: c = " + c);

       
        a += b; 
        System.out.println("Addition Assignment: a += b -> a = " + a);

       
        a -= b; 
        System.out.println("Subtraction Assignment: a -= b -> a = " + a);

        a *= b; 
        System.out.println("Multiplication Assignment: a *= b -> a = " + a);

        
        a /= b;
        System.out.println("Division Assignment: a /= b -> a = " + a);

   
        a %= b; 
        System.out.println("Modulus Assignment: a %= b -> a = " + a);
    }
}
