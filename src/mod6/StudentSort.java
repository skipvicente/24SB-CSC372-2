package mod6;
import java.util.ArrayList;

public class StudentSort {

    public static void main(String[] args) {
        System.out.println("default");

        ArrayList<GenerateStudent> students = new ArrayList<>();

        students.add(new GenerateStudent("adam", 3, "10123 Hibernia Dr, Houston, TX 77449"));

        SortingByStudent newRoll = new SortingByStudent(students);
        for (GenerateStudent student : newRoll.getNameSorted()) {
            String studentInfo = "Name: " + student.studentNames + ", Roll Number: " + student.rollerNumber + ", Address: " + student.address + "\n";
            System.out.println(studentInfo);
        }

        SortingRolling newRoll2 = new SortingRolling(newRoll.getNameSorted());

        for (GenerateStudent student : newRoll2.getRollSorted()) {
            String studentInfo = "Name: " + student.studentNames + ", Roll Number: " + student.rollerNumber + ", Address: " + student.address + "\n";
            System.out.println(studentInfo);
        }
    }
}
