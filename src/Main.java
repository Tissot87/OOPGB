public class Main {

    public static void main(String[] args) {

    Account account = new Account();
    CreditAccount creditAccount = new CreditAccount();
    account.putAmount(350);

        creditAccount.takeAmount(100);
        System.out.println(creditAccount.getAmount());




    }
}
