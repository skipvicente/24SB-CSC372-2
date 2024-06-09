package mod01;

public class SuperBank {

    private String firstName;
    private String lastName;
    private Integer accountNumber;
    private Double balance;

    public SuperBank(){
        this.balance = 0.0;
    }

    /* Getter-Setter First name */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName() {
        return this.firstName;
    }


    /* Getter-Setter Last name */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName() {
        return this.lastName;
    }


    /* Getter-Setter account number as the ID number */
    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }
    public Integer getAccountNumber() {
        return this.accountNumber;
    }

     public void deposit(double initialDepositAmount){
         if (initialDepositAmount > 0) {
             this.balance += initialDepositAmount;
         }
         else {
             System.out.println("Deposit may not be negative.");
         }
     }

     public void withdraw(double inputAmount){
         double totalAmount = inputAmount;
         if (totalAmount <= this.balance) {
             System.out.println("Step one balance: " + this.balance + "\n");
             this.balance = this.balance - totalAmount;
             System.out.println("Step two balance: " + this.balance + "\n");
         } else
         {
             this.balance = this.balance - totalAmount;
             this.balance = this.balance - 30; // Penalty for insufficient funds
             System.out.println("teest from super bank" + this.balance);
             System.out.println("new Insufficient funds. Penalty of $30 applied.");
         }
     }

    public Double getBalance() {
        return this.balance;
    }

    public void accountSummary(){
        System.out.println("First Name: " + this.firstName);
        System.out.println("Last Name: " + this.lastName);
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Account Balance: $" + String.format("%.2f", this.balance) + "\n");
    }
}
