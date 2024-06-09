package mod01;

public class CheckBank extends SuperBank{
    private  String interestRateAttribute;

    public CheckBank(String InputInterestRate){
        super();
        this.interestRateAttribute = InputInterestRate + "%" ;
    }

    public void processWithdrawal(double withdrawAmount) {
        if (withdrawAmount <= getBalance()) {
            //**System.out.println("Step one balance: " + getBalance() + "\n");
            //**System.out.println("Step one withdraw total amount: " + withdrawAmount + "\n");
            super.withdraw(withdrawAmount);
            //**System.out.println("New balance after withdrawal: " + getBalance() + "\n");
        } else {
            //**System.out.println("Insufficient funds. Fee assessed.");
            double totalAmount = getBalance() - withdrawAmount;
            totalAmount -= 30; // Adding penalty fee
            //super.withdraw(totalAmount);
            super.withdraw(withdrawAmount);
            //**System.out.println("New balance after overdrawn: " + getBalance() + "\n");
        }
    }

     public void displayAccount(){
        super.accountSummary();
        System.out.println("Account interest rate: " + this.interestRateAttribute);
     }
}
