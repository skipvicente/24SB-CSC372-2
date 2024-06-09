package mod01;

public class CheckBank extends SuperBank{
    private  String interestRateAttribute;

    public CheckBank(String InputInterestRate){
        super();
        this.interestRateAttribute = InputInterestRate + "%" ;
    }

    public void processWithdrawal(double withdrawAmount) {
        if (withdrawAmount <= getBalance()) {
            super.withdraw(withdrawAmount);
        }
        else {
            double totalAmount = getBalance() - withdrawAmount;
            totalAmount -= 30; // Adding penalty fee
            super.withdraw(withdrawAmount);
        }
    }

     public void displayAccount(){
        super.accountSummary();
        System.out.println("Account interest rate: " + this.interestRateAttribute);
     }
}
