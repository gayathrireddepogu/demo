package Task34;

public class Default {
    int id;
    String name;

    public Default() {

    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String args[]) {

        Default s1 = new Default();
        Default s2 = new Default();

        s1.display();
        s2.display();
    }
}
