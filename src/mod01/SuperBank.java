package mod01;

public class SuperBank {

    private String firstName;
    private String lastName;
    private Integer accountID;
    private Double balance;

    public SuperBank(){
        this.balance = 0.0;
    }

    /* Getter-Setter First name */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName(String firstName) {
        return firstName;
    }


    /* Getter-Setter Last name */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName(String lastName) {
        return lastName;
    }


    /* Getter-Setter account ID */
    public void setAccountID(Integer accountID) {
        this.accountID = accountID;
    }
    public Integer getAccountID() {
        return accountID;
    }

     public void deposit(double inputAmount){
        this.balance = this.balance + inputAmount; /* add here */
     }

    public void withdraw(double inputAmount){
        this.balance = this.balance - inputAmount; /* subtract here */
    }

    public Double getBalance() {
        return this.balance;
    }

    public void accountSummary(){
        System.out.printf("Test" + this.firstName);
        System.out.printf("Test" + this.lastName);
        System.out.printf("Test" + this.accountID);
        System.out.printf("Test" + this.balance);
    }
}
