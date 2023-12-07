package sem_7.adapter;

public class MeteoStore {

    boolean save(MeteoSensor meteoSensor){

        System.out.printf("Saving date from sensor %d at %s%n temperature %.2f, humidity %.2f, pressure %.2f\n",
                meteoSensor.getId(),
                meteoSensor.getDateTime(),
                meteoSensor.getTemperature(),
                meteoSensor.getHumidity(),
                meteoSensor.getPressure());
        return true;
    }

}
