package Task9;

public class Encapsulation {
    // Private instance variables (data)
    private String name;
    private int age;

    // Public constructor to initialize the object
    public Encapsulation(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Public getter method to access the private variable 'name'
    public String getName() {
        return name;
    }

    // Public setter method to modify the private variable 'name'
    public void setName(String name) {
        this.name = name;
    }

    // Public getter method to access the private variable 'age'
    public int getAge() {
        return age;
    }

    // Public setter method to modify the private variable 'age'
    public void setAge(int age) {
        // Add validation if needed
        this.age = age;
    }

    // Public method to display information about the person
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        // Creating an object of the Person class
        Encapsulation person = new Encapsulation("John", 25);

        // Accessing and modifying data through public methods
        person.displayInfo();
        person.setName("Jane");
        person.setAge(30);
        person.displayInfo();
    }
}
