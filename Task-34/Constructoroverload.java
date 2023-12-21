package Task34;

public class Constructoroverload {

    int studentId;
    String studentName;
    Constructoroverload() {
        System.out.println("This is a default constructor");
    }

    Constructoroverload(int id, String name) {
        studentId = id;
        studentName = name;
    }

    public static void main(String[] args) {

        Constructoroverload defaultStudent = new Constructoroverload();
        System.out.println("\nDefault Constructor values: \n");
        System.out.println("Student Id : " + defaultStudent.studentId + "\nStudent Name : " + defaultStudent.studentName);

        System.out.println("\nParameterized Constructor values: \n");
        Constructoroverload parameterizedStudent = new Constructoroverload(10, "Gayathri");
        System.out.println("Student Id : " + parameterizedStudent.studentId + "\nStudent Name : " + parameterizedStudent.studentName);
    }
}
