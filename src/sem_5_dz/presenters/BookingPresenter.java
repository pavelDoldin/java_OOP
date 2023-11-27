package sem_5_dz.presenters;


import java.util.Date;

public class BookingPresenter implements ViewObserver {

    private final Model model;
    private final View view;

    public BookingPresenter(Model model, View view){
        this.model = model;
        this.view = view;
        this.view.registerObserver(this);
    }

    public void updateTablesUI(){
        view.showTables(model.loadTables());
    }

    @Override
    public void OnReservationTable(Date orderDate, int tableON, String name) {
        System.out.println("Презентор реагирует на событие");
        try {
            int reservationNo = model.reservationTable(orderDate, tableON, name);
            view.showReservationTableResult(reservationNo);
        }
        catch (RuntimeException e){
            view.showReservationTableResult(-1);
        }

    }
}
