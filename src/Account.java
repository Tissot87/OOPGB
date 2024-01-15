public class Account {

    private double amount = 200;

    public void putAmount(double sum){
        amount = amount + sum;
    }

    public void takeAmount(double sum){
        if (sum <= amount) {
            amount = amount - sum;
        } else System.out.println("Сумма превышает баланс на счете");
    }

    public double getAmount() {
        return amount;
    }
}
