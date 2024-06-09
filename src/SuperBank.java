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

    public void setAccountID(Integer accountID) {
        this.accountID = accountID;
    }

}
