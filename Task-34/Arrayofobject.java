package Task34;

public class Arrayofobject {
    int studentId;
    String studentName;

    public Arrayofobject(int id, String name) {
        studentId = id;
        studentName = name;
    }

    public void display() {
        System.out.println("Student ID: " + studentId + ", Student Name: " + studentName);
    }

    public static void main(String[] args) {

        Arrayofobject[] students = new Arrayofobject[3];

        students[0] = new Arrayofobject(101, "aaaaaaaaaaaaaaaaaa");
        students[1] = new Arrayofobject(102, "bbbbbbbbbbbbbbbbbbbbbbbb");
        students[2] = new Arrayofobject(103, "cccccccccccccccccccccccccccccc");
        for (Arrayofobject student : students) {
            student.display();
        }
    }
}
