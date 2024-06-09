package mod01;
import java.util.Scanner;

class TestBank {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        //System.out.println("default");
        CheckBank checkBank = new CheckBank("5");

        System.out.println("Enter First Name");
        String clientFirstName = scnr.nextLine();

        System.out.println("Enter Last Name");
        String clientLastName = scnr.nextLine();

        /* setup accounts and summary */
        checkBank.setAccountNumber(1122334);
        checkBank.setFirstName(clientFirstName);
        checkBank.setLastName(clientLastName);
        checkBank.accountSummary();


        System.out.println("Enter Initial Deposit Amount");
        Double initialDepositAmount = scnr.nextDouble();

        /* test case how to withdraw money */
        checkBank.deposit(initialDepositAmount);
        checkBank.processWithdrawal(25);
        checkBank.processWithdrawal(100);
        checkBank.processWithdrawal(250);
        checkBank.processWithdrawal(500);
        checkBank.displayAccount();

        scnr.close();

    }
}