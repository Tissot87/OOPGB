public class CreditAccount extends Account{

   // private double creditAmount = 10000;
    @Override
    public void takeAmount(double sum) {
        super.takeAmount(sum + sum/100);
    }

}
