package Task34;

public class Parametarized {
    int id;
    String name;

    public Parametarized(int i, String n) {
        id = i;
        name = n;
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String args[]) {

        Parametarized s1 = new Parametarized(111, "Kranth");
        Parametarized s2 = new Parametarized(222, "Kumar");

        s1.display();
        s2.display();
    }
}

