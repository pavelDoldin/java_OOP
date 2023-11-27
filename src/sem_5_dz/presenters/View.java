package sem_5_dz.presenters;

import sem_5_dz.models.Table;

import java.util.Collection;

public interface View {

    void showTables(Collection<Table> tables);

    void showReservationTableResult(int reservationNo);

    void registerObserver(ViewObserver observer);

}
