package mod01;

public class CheckBank extends SuperBank{
    private  String interestRateAttribute;
    private Double balance;

    public CheckBank(String InputInterestRate){
        super();
        this.interestRateAttribute = InputInterestRate + "%" ;
    }

     public void processWithdrawal(double withDrawAmount){
        double totalAmount = withDrawAmount;
        if (totalAmount <= getBalance()) {
            System.out.println("step one total amount: " + totalAmount + "\n");
            totalAmount = totalAmount - 30;
            super.withdraw(totalAmount);
            //System.out.println("test overdraft fee");
            System.out.println("new balance!!: " + totalAmount + "\n");
         }

         else {
             System.out.println("Insufficient funds");
         }
     }

     public void displayAccount(){
        super.accountSummary();
        System.out.println("Account interest rate: " + this.interestRateAttribute);
     }
}
