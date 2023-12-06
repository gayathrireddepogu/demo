package Task25;

class Animal {
    public void eat() {
        System.out.println("Animal is eating.");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("Dog is barking.");
    }
}

public class Upanddowncasting {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.eat(); 

        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.eat(); 
            dog.bark(); 
        } else {
            System.out.println("Cannot downcast to Dog.");
        }
    }
}

