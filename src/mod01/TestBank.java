package mod01;

class TestBank {
    public static void main(String[] args) {
        System.out.println("default");
        CheckBank checkBank = new CheckBank("5");

        /* setup accounts and summary */
        checkBank.setAccountID(1122334);
        checkBank.setFirstName("Jane");
        checkBank.setLastName("Doe");
        checkBank.accountSummary();



        /* test case how to withdraw money */
        checkBank.deposit(999);
        checkBank.processWithdrawal(25);
        checkBank.processWithdrawal(100);
        checkBank.processWithdrawal(250);
        checkBank.processWithdrawal(500);
        checkBank.displayAccount();

    }
}