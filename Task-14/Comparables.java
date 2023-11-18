package Task14;

public class Comparables implements Comparable<Comparables> {
    private String name;
    private int age;

    public Comparables(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Comparables otherPerson) {
        // Compare based on age
        return Integer.compare(this.age, otherPerson.age);
    }

    public static void main(String[] args) {
        Comparables person1 = new Comparables("Alice", 25);
        Comparables person2 = new Comparables("Bob", 30);

        int result = person1.compareTo(person2);

        if (result < 0) {
            System.out.println(person1.name + " is younger than " + person2.name);
        } else if (result > 0) {
            System.out.println(person1.name + " is older than " + person2.name);
        } else {
            System.out.println(person1.name + " and " + person2.name + " are of the same age.");
        }
    }
}
