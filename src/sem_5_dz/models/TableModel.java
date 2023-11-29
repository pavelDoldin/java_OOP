package sem_5_dz.models;

import sem_5_dz.presenters.Model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class TableModel implements Model {

    private Collection<Table> tables;


    @Override
    public Collection<Table> loadTables() {

        if (tables == null){
            tables = new ArrayList<>();

            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
        }
        return tables;
    }

    @Override
    public int reservationTable(Date reservationDate, int tableNo, String name) {

        for (Table table : loadTables()) {
            if (table.getNo() == tableNo){
                Reservation reservation = new Reservation(table, reservationDate, name);
                table.getReservations().add(reservation);
                return reservation.getId();
            }
        }
        throw new RuntimeException("Некорректный номер столика");

    }



    /**TODO : Сделать дама 4
     * Удалить столик и зарезервировать новый столик
     * @param oldReservation
     * @param orderDate
     * @param tableON
     * @param name
     * @return
     */
    public int changeReservationTable(int oldReservation, Date orderDate, int tableON, String name){
        for (Table table : loadTables()) {
            for (Reservation reservation : table.getReservations()) {
                if (reservation.getId() == oldReservation) {
                    System.out.println("Старая бронь удалена.");
                }
                else throw new RuntimeException("Некорректный номер брони.");
            }
        }

        return reservationTable(orderDate, tableON, name);

    }


}



















