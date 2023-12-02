package sem_6.task_2_dz;

public class Program {
    public static void main(String[] args) {

        /**
         * TODO : Доработать дома
         */

        Order order = new Order();
        InputFromConsole inputFromConsole1 = new InputFromConsole(order);
        inputFromConsole1.inputFromConsole();
        SaveToJson saveToJson1 = new SaveToJson(order);
        saveToJson1.saveToJson();


    }
}
