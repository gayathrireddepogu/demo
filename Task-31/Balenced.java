package Task31;

public class Balenced {

    public static boolean isBalanced(String expression) {
        int balance = 0;

        for (char ch : expression.toCharArray()) {
            if (ch == '(') {
                balance++;
            } else if (ch == ')') {
                balance--;
                if (balance < 0) {
                    return false;
                }
            }
        }

        return balance == 0; 
    }

    public static void main(String[] args) {
        String expression = "(a + b) * (c - d)";
        boolean result = isBalanced(expression);

        if (result) {
            System.out.println("The expression is balanced.");
        } else {
            System.out.println("The expression is not balanced.");
        }
    }
}

