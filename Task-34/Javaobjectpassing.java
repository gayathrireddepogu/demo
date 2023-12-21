package Task34;

class Dog {
    String name;

    Dog(String name) {
        this.name = name;
    }
}

public class Javaobjectpassing {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy");
        System.out.println("Original Dog name: " + myDog.name);

        modifyDogName(myDog);
        System.out.println("Modified Dog name: " + myDog.name);
    }

    static void modifyDogName(Dog dog) {

        dog.name = "Max";
    }
}

