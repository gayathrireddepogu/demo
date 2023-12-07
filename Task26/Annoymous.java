package Task26;

interface Eatable {
    void eat();
}

public class Annoymous {
    public static void main(String[] args) {
        Eatable e = new Eatable() {
            public void eat() {
                System.out.println("Good food");
            }
        };

        e.eat();
    }
}
