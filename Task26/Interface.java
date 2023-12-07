package Task26;

import java.io.*;

interface In1 {
    int a = 10;

    void display();
}

class Interface implements In1 {

    public void display() {
        System.out.println("Gayathri");
    }

    public static void main(String[] args) {
        Interface t = new Interface();
        t.display();

        System.out.println(In1.a);
    }
}
