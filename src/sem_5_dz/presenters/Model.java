package sem_5_dz.presenters;

import sem_5_dz.models.Table;

import java.util.Collection;
import java.util.Date;

public interface Model {

    Collection<Table> loadTables();

    int reservationTable(Date reservationDate, int tableNo, String name);

    /**
     * Todo: И это дома ) 2
     * @return
     */
    int changeReservationTable(int oldReservation, Date orderDate, int tableON, String name);

}
