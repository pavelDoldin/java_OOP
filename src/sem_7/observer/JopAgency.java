package sem_7.observer;

import java.util.ArrayList;
import java.util.Collection;

public class JopAgency implements Publisher {

    private String post;

    private Collection<Observer> observers = new ArrayList<>();


    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }




    @Override
    public void sendOffer(String companyName, int salary, String post, int experience) {
        for (Observer observer : observers) {
            observer.receiveOffer(companyName, salary, post, experience);
        }
    }
}
