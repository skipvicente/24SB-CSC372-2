package mod6;
import java.util.ArrayList;

public class StudentSort {

    public static void main(String[] args) {
        System.out.println("default");

        ArrayList<GenerateStudent> students = new ArrayList<>();

        students.add(new GenerateStudent("adam", 3, "10123 Hibernia Dr, Houston, TX 77449"));

        SortingByStudent newRoll = new SortingByStudent(students);
        for (GenerateStudent student : newRoll.getNameSorted())
    }
}
