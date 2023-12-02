package sem_6.task_5;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {


        List<PhonePaymentService> paymentServices = new ArrayList<>();
        paymentServices.add(new InternetPaymentService());
        //paymentServices.add(new CustomPaymentService());

        for (PhonePaymentService paymentService : paymentServices) {
            paymentService.payPhoneNumber(2000);
            break;
        }
    }

}
