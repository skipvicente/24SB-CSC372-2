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


    /* Getter-Setter account number as the ID number */
    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }
    public Integer getAccountNumber() {
        return accountNumber;
    }

     public void deposit(double inputAmount){
        this.balance = this.balance + inputAmount; /* add here */
     }

    public void withdraw(double inputAmount){
        if (inputAmount <= balance) {
            balance -= inputAmount;
        }
        else {
            System.out.println("Insufficient funds");
            //this.balance = this.balance - inputAmount;
        }
    }

    public Double getBalance() {
        return this.balance;
    }

    public void accountSummary(){
        System.out.println("First Name: " + this.firstName);
        System.out.println("Last Name: " + this.lastName);
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Account Balance: " + this.balance + "\n");
    }
}
