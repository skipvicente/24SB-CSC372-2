package mod6;
import java.util.ArrayList;

public class SortingRolling {
    private ArrayList<GenerateStudent> rollNumberSorted;

    // Sorting data by roll number using selection sort
    public SortingRolling(ArrayList<GenerateStudent> inputStudentList) {

        rollNumberSorted = new ArrayList<>(inputStudentList);

        for (int i = 0; i < rollNumberSorted.size() - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < rollNumberSorted.size(); j++) {
                if (rollNumberSorted.get(j).rollNumber < rollNumberSorted.get(minIndex).rollNumber) {
                    minIndex = j;
                }
            }

            if (i != minIndex) {
                GenerateStudent temp = rollNumberSorted.get(i);
                rollNumberSorted.set(i, rollNumberSorted.get(minIndex));
                rollNumberSorted.set(minIndex, temp);
            }
        }
    }

    public ArrayList<GenerateStudent> getRollSorted() {
        return this.rollNumberSorted;
    }
}
