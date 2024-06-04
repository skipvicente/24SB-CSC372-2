import java.util.Scanner;

public class NumberProductProgram {

    public static int calculateUserNumbers(int[] numbers, int index) {
        if (index < 0) {
            return 1;
        }
        // Recursive calculate product of numbers
        return numbers[index] * calculateUserNumbers(numbers, index - 1);
    }

    public static void main(String[] args) {
        Scanner scnr01 = new Scanner(System.in);

        int[] userNumbers = new int[5]; /* Only using 5 because we only want to permit 5 elements in array */
        int count = 0;

        for (count = 0; count < 5; count++) {
            System.out.println("Enter number " + (count + 1) + " of 5 ");
            userNumbers[count] = scnr01.nextInt();

        }

        int product = calculateUserNumbers(userNumbers, 4);

        System.out.println("The product of your numbers is: " + product);

        scnr01.close();
    }
}
