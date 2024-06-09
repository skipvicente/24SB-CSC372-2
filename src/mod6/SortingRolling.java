package mod6;
import java.util.ArrayList;

public class SortingRolling {
    private  ArrayList<GenerateStudent> rollNumberSorted;

    //Sorting data by student name
    public SortingRolling(ArrayList<GenerateStudent> inputStudentList) {

        for (int i = 0; i < inputStudentList.size()-1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < inputStudentList.size(); j++) {
                if (inputStudentList.get(j).rollNumber < inputStudentList.get(minIndex).rollNumber) {
                    minIndex = j;
                }

                if (i != minIndex) {
                    GenerateStudent temp = inputStudentList.get(i);
                    inputStudentList.set(i, inputStudentList.get(minIndex));
                    inputStudentList.set(minIndex, temp);
                }
            }
        }

        this.rollNumberSorted = inputStudentList;
    }

    public ArrayList<GenerateStudent> getRollSorted() {
        return this.rollNumberSorted;
    }
}
