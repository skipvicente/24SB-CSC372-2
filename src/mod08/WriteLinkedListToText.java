package mod08;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

public class WriteLinkedListToText {

    public void pushToText(LinkedList<Student> students, String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName + ".txt"))) {
            for (Student student : students) {
                writer.write("Name: " + student.studentNames + ", GPA: " + student.GPA + ", Address: " + student.address);
                writer.newLine();
            }
            System.out.println("Data successfully saved to " + fileName + ".txt");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}