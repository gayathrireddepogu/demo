package Task22;

class Student {
    private String name;
    private int id;
    private int grade;

    public Student(String name, int id, int grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }
}

public class ArrayOfObjects {
    public static void main(String[] args) {
  
        Student[] students = new Student[3];

        students[0] = new Student("Alice", 12345, 98);

        students[1] = new Student("Bob", 54321, 92);

        students[2] = new Student("Charlie", 67890, 85);

        for (Student student : students) {
            System.out.println(student.getName());
        }
    }
}
