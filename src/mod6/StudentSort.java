package mod6;
import java.util.ArrayList;

public class StudentSort {

    public static void main(String[] args) {


        ArrayList<GenerateStudent> students = new ArrayList<>();

        students.add(new GenerateStudent("Adam", 3, "10123 Hibernia Dr, Houston, TX 77388"));
        students.add(new GenerateStudent("Chris", 8, "71201 Medow Glenn Dr, Spring, TX 77387"));
        students.add(new GenerateStudent("Daisy", 2, "1906 Gessner Rd, Houston, TX 77088"));
        students.add(new GenerateStudent("Sam", 5, "101 Wasington Dr, Houston, TX 77080"));
        students.add(new GenerateStudent("Ken", 6, "9825 Westgreen Ln, Katy, TX 77449"));
        students.add(new GenerateStudent("Kathy", 9, "11011 Hammerly Dr, Houston, TX 77080"));
        students.add(new GenerateStudent("Wendy", 5, "991 Post Oak Rd, Houston, TX 77288"));
        students.add(new GenerateStudent("Vince", 1, "8712 Gareth Rd, Baytown, TX 77050"));
        students.add(new GenerateStudent("Brad", 4, "5452 Woodland Circle, Woodlands, TX 77621"));
        students.add(new GenerateStudent("Tony", 8, "34 Richy Road, Houston, TX 77241"));


        SortingByStudent newRoll = new SortingByStudent(students);
        System.out.println("Sorted by Student Name:");
        for (GenerateStudent student : newRoll.getNameSorted()) {
            String studentInfo = "Name: " + student.studentNames + ", Roll Number: " + student.rollNumber + ", Address: " + student.address;
            System.out.println(studentInfo);
        }

        SortingRolling newRoll2 = new SortingRolling(newRoll.getNameSorted());
        System.out.println("\n" + "Sorted by Roll Number:");
        for (GenerateStudent student : newRoll2.getRollSorted()) {
            String studentInfo = "Name: " + student.studentNames + ", Roll Number: " + student.rollNumber + ", Address: " + student.address;
            System.out.println(studentInfo);
        }
    }
}
