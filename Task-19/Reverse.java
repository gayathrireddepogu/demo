package Task19;

public class Reverse {
    public static String reverseWord(String str) {
        String[] words = str.split("\\s");
        StringBuilder reverseWord = new StringBuilder();

        for (String w : words) {
            StringBuilder sb = new StringBuilder(w);
            sb.reverse();
            reverseWord.append(sb.toString()).append(" ");
        }

        return reverseWord.toString().trim();
    }

    public static void main(String[] args) {
        String inputString = "HELLO WORLD";
        String reversedString = reverseWord(inputString);

        System.out.println("Original string: " + inputString);
        System.out.println("Reversed words: " + reversedString);
    }
}
