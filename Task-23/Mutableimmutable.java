package Task23;

public class Mutableimmutable {
    public static void main(String[] args) {
      
        String immutableStr = "Hello";
        System.out.println("Original Immutable String: " + immutableStr);

        immutableStr = immutableStr.concat(", World!");
        System.out.println("Modified Immutable String: " + immutableStr);

        StringBuilder mutableStr = new StringBuilder("Hello");
        System.out.println("Original Mutable String: " + mutableStr);

        mutableStr.append(", World!");
        System.out.println("Modified Mutable String: " + mutableStr);
    }
}

