package sem_5_dz.presenters;

import java.util.Date;

public interface ViewObserver {

    void OnReservationTable(Date orderDate, int tableON, String name);

}
