package sem_5_dz;

import sem_5_dz.models.Table;
import sem_5_dz.models.TableModel;
import sem_5_dz.presenters.BookingPresenter;
import sem_5_dz.views.BookingView;

import java.util.Date;

public class Program {
    public static void main(String[] args) {

        TableModel tableModel = new TableModel();
        BookingView bookingView = new BookingView();
        BookingPresenter bookingPresenter = new BookingPresenter(tableModel, bookingView);
        bookingPresenter.updateTablesUI();

        bookingView.reservationTable(new Date(), 2, "Pavel");


        /**
         *  TODO : Чтоб зароботало !!!!!!!!!!!!!!!!!!!!!!
         */
        bookingView.changeReservationTable(1001, new Date(), 3, "Pavel");

    }
}
