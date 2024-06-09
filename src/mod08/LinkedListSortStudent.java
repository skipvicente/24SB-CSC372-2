package mod08;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListSortStudent{
    private static char choice;

    public static void main (String[] args) {

        LinkedList<Student> students = new LinkedList<>();

        //user input loop
        do{
            Scanner scanner = new Scanner(System.in);
            FileData fileData = new FileData();

            System.out.print("Enter student name: ");
            String inputName = scanner.nextLine();

            System.out.print("Enter address: ");
            String inputAddress = scanner.nextLine();

            System.out.print("Enter student GPA (0.0 - 4.0): ");

            try{
                double inputGPA = fileData.getGPA(scanner);
                Student student = new Student(inputName, inputGPA, inputAddress);
                students.add(student);
            }catch(Exception e){
                System.out.println("the input GPA is not between 0.0 -- 4.0 or double data input");
            }

            System.out.println("Enter another student information (y/n)? ");
            choice = scanner.next().toLowerCase().charAt(0);
        }while (choice == 'y');

        // sorting by student name
        students.sort((student1, student2) -> student1.studentNames.compareTo(student2.studentNames));

        //print the data after sorting
        for (Student student : students) {
            String studentInfo = "Name: " + student.studentNames + ", GPA: " + student.GPA + ", Address: " + student.address + "\n";
            System.out.println(studentInfo);
        }

        // saved the sort data to StudentData.txt
        WriteLinkedListToText writeIt = new WriteLinkedListToText();
        writeIt.pushToText(students, "StudentData");

    }
}

