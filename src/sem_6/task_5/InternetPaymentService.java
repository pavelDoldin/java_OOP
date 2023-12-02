package sem_6.task_5;

public class InternetPaymentService extends PaymentSrv implements CreditCardPaymentService, PhonePaymentService, WebMoneyPaymentService {


    @Override
    public void payWebMoney(int amount) {
        System.out.printf("Internet Provider pay bo Web money %d\n", amount);
    }

    @Override
    public void payCreditCard(int amount) {
        System.out.printf("Internet Provider pay bo Credit card %d\n", amount);
    }

    @Override
    public void payPhoneNumber(int amount) {
        System.out.printf("Internet Provider pay bo Phone number %d\n", amount);
    }
}
