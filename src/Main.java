package BankMod01//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or

class TestBank {
    public static void main(String[] args) {
        System.out.print("default");
        CheckBank checkBank = new CheckBank("5");

        /* setup accounts and summary */
        checkBank.setAccountID(1122334);
        checkBank.setFirstName("Jane");
        checkBank.setLastName("Doe");
        checkBank.accountSummary();

        System.out.printf("Test" + setAccountID);
        System.out.printf("Test" + setFirstName);
        System.out.printf("Test" + setLastName);
        System.out.printf("Test" + accountSummary);



    }
}