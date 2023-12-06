package Task25;

public class keyword {
    public static void main(String[] args) {
        String sentence = "This is a sample sentence with a keyword.";

        String keyword = "keyword";

        int index = sentence.indexOf(keyword);

        if (index != -1) {
            System.out.println("Keyword found at index: " + index);
        } else {
            System.out.println("Keyword not found in the sentence.");
        }
    }
}

