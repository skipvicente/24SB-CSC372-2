package mod08;

import java.util.Scanner;

public class FileData {

    public Double getGPA(Scanner scanner)
    {
        Double gpa = scanner.nextDouble();
        if (gpa > 0.0 && gpa <= 4.0) {
            return gpa;
        }
        else {
            return null;
        }
    }
}


