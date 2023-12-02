package sem_6.task_5;

public class CustomPaymentService extends PaymentSrv implements WebMoneyPaymentService, CreditCardPaymentService {

    @Override
    public void payWebMoney(int amount) {
        System.out.printf("Internet Provider pay bo Web money %d\n", amount);
    }

    @Override
    public void payCreditCard(int amount) {
        System.out.printf("Internet Provider pay bo Credit card %d\n", amount);
    }



}
