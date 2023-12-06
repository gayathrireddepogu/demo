package Task25;

class Poly {
    void run() {
        System.out.println("running");
    }
}

public class Splendor extends Poly {
    void run() {
        System.out.println("running safely with 60km");
    }

    public static void main(String args[]) {
        Poly poly = new Splendor();
        poly.run();
    }
}
