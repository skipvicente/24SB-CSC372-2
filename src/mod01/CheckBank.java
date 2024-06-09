package mod01;

public class CheckBank extends SuperBank{
    private  String interestRateAttribute;

    public CheckBank(String InputInterestRate){
        super();
        this.interestRateAttribute = InputInterestRate + "%" ;
    }

     public void processWithdrawal(double withDrawAmount){
        super.withdraw(withDrawAmount + 30);
        System.out.println("Balance after withdraw: " + this.getBalance());
     }

     public void displayAccount(){
        super.accountSummary();
        System.out.println("Balance with interest rate: " + this.interestRateAttribute);
     }
}
