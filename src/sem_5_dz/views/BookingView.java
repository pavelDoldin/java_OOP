package sem_5_dz.views;

import sem_5_dz.models.Table;
import sem_5_dz.presenters.View;
import sem_5_dz.presenters.ViewObserver;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class BookingView implements View {

    private Collection<ViewObserver> observers = new ArrayList<>();


    @Override
    public void registerObserver(ViewObserver observer) {
        observers.add(observer);
    }


    @Override
    public void showTables(Collection<Table> tables) {

        for (Table table : tables) {
            System.out.println(table);
        }
    }

    @Override
    public void showReservationTableResult(int reservationNo) {
        if ( reservationNo > 0 ){
            System.out.printf("Столик успешно зарезервирован. Номер резерва %d\n", reservationNo);

        }
        else {
            System.out.println("Произашла ошибка бронирования повторите попытку позже ");
        }
    }


    public void reservationTable(Date orderDate, int tableON, String name){

        System.out.println("Возбуждаеться события бронирования столика");
        System.out.println("Происходит уведомления наблюдателей");

        for (ViewObserver observer : observers){
            observer.OnReservationTable(orderDate, tableON, name);
        }

    }

    public void changeReservationTable(int oldReservation, Date orderDate, int tableON, String name){

    }

}
