package sem_6.task_5;

public interface PaymentService {

    void payWebMoney(int amount);
    void payCreditCard(int amount);
    void payPhoneNumber(int amount);

}
