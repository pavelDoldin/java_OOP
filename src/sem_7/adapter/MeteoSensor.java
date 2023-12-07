package sem_7.adapter;


import java.time.LocalDateTime;

public interface MeteoSensor {

    int getId(); // Уникальный номер датчика

    double getTemperature(); // Средняя температура

    double getHumidity(); // Влажность

    double getPressure(); // Давление

    LocalDateTime getDateTime(); // Дата и время

}
