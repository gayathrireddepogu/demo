package Task21;

public class Ifelseifstatement {
    public static void main(String[] args) {
        int marks = 75;

        if (marks >= 90 && marks <= 100) {
            System.out.println("Grade A");
        } else if (marks >= 80 && marks < 90) {
            System.out.println("Grade B");
        } else if (marks >= 70 && marks < 80) {
            System.out.println("Grade C");
        } else if (marks >= 60 && marks < 70) {
            System.out.println("Grade D");
        } else if (marks >= 0 && marks < 60) {
            System.out.println("Grade F");
        } else {
            System.out.println("Invalid marks");
        }
    }
}
