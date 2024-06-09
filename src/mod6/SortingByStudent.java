package mod6;
import java.util.ArrayList;

public class SortingByStudent {
    private ArrayList<GenerateStudent> studentNameOrder;

    //Sorting data by student name
    public SortingByStudent(ArrayList<GenerateStudent> inputStudentList) {

        for (int i = 0; i < inputStudentList.size()-1; i++){
            int minIndex = i;

            for (int j = i + 1; j < inputStudentList.size(); j++) {
                if (inputStudentList.get(j).studentNames.compareTo(inputStudentList.get(minIndex).studentNames) < 0) {
                    minIndex = j;
                }

                if (i != minIndex) {
                    GenerateStudent temp = inputStudentList.get(i);
                    inputStudentList.set(i, inputStudentList.get(minIndex));
                    inputStudentList.set(minIndex, temp);
                }
            }
        }

        this.studentNameOrder = inputStudentList;
    }

    public ArrayList<GenerateStudent> getNameSorted(){
        return this.studentNameOrder;
    }
}
