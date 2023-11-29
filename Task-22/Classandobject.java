package Task22;

class Person {

 String name;
 int age;


 public Person(String name, int age) {
     this.name = name;
     this.age = age;
 }

 public void displayInfo() {
     System.out.println("Name: " + name);
     System.out.println("Age: " + age);
 }
}

public class Classandobject {
 public static void main(String[] args) {
  
     Person person1 = new Person("John", 25);

     System.out.println("Person 1:");
     person1.displayInfo();

     Person person2 = new Person("Alice", 30);

     System.out.println("\nPerson 2:");
     person2.displayInfo();
 }
}

