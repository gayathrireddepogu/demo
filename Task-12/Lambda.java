package Task12;

interface MyInterface {  
    int myMethod(int x);  
}  
  
public class Lambda {  
    public static void main(String[] args) {  
        MyInterface myInterface = (x) -> {  
            return x * x; // Return the square of x  
        };  
        int result = myInterface.myMethod(5);  
        System.out.println("The square of 5 is " + result); // Output: The square of 5 is 25  
    }  
}  