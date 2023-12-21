package Task34;

public class Object {

    String name;
    int age;
    public Object(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

        Object person1 = new Object("Gayathri", 21);
        Object person2 = new Object("Jhansi", 21);

        System.out.println("Person 1:");
        person1.displayInfo();

        System.out.println("\nPerson 2:");
        person2.displayInfo();
    }
}

