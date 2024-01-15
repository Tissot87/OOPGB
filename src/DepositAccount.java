import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DepositAccount extends Account{

    LocalDate lastPutAmount;


    @Override
    public void putAmount(double sum) {
        super.putAmount(sum);
        lastPutAmount = LocalDate.now();
    }

    @Override
    public void takeAmount(double sum) {

        LocalDate now = LocalDate.now();
        long monthBetweenTodayAndNow = ChronoUnit.MONTHS.between(lastPutAmount, now);
       if ( monthBetweenTodayAndNow >= 1) {
        super.takeAmount(sum);
       } else {
           System.out.println("Снятие невозможно, прошло менее 1 месяца, с момента последнего пополнения");
       }
    }
}
