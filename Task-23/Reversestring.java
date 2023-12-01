package Task23;

public class Reversestring {
    public static String reverseWord(String str) {
        String words[] = str.split("\\s");
        String reverseWord = "";
        for (String w : words) {
            StringBuilder sb = new StringBuilder(w);
            sb.reverse();
            reverseWord += sb.toString() + " ";
        }
        return reverseWord.trim();
    }
}

class Reversefor {
    public static void main(String[] args) {
        System.out.println(Reversestring.reverseWord("my name is khan"));
        System.out.println(Reversestring.reverseWord("I am sonoo jaiswal"));
    }
}
