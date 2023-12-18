package Task31;

public class Palindromeinjava {

    public static boolean isPalindrome(String str) {

        String cleanedStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int start = 0;
        int end = cleanedStr.length() - 1;

        while (start < end) {
            if (cleanedStr.charAt(start) != cleanedStr.charAt(end)) {
                return false; 
            }
            start++;
            end--;
        }

        return true; 
    }

    public static void main(String[] args) {
        String inputString = "A man, a plan, a canal, Panama";

        if (isPalindrome(inputString)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}

