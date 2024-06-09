package BankMod01

public class SuperBank {

    String firstName;
    String lastName;
    Integer accountID;
    Double balance;

    public SuperBank(){
        this.balance = 0.0;
    }

    /* Getter-Setter First name */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName() {
        return firstName;
    }


    /* Getter-Setter Last name */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName() {
        return lastName;
    }


    /* Getter-Setter account ID */
    public void setAccountID(Integer accountID) {
        this.accountID = accountID;
    }
    public Integer getAccountID() {
        return accountID;
    }

     @Override
     public void deposit(double inputAmount){
        this.balance = this.balance + inputAmount; /* add here */
     }

    public Double getBalance() {
        return balance;
    }

    public void withdraw(double inputAmount){
        this.balance = this.balance - inputAmount; /* subtract here */
    }

    public void accountSummary(){
        System.out.printf("Test" + firstName);
        System.out.printf("Test" + firstName);
        System.out.printf("Test" + accountID);
        System.out.printf("Test" + balance);
    }
}
