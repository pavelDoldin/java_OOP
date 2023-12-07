package sem_7.observer;

import java.util.ArrayList;
import java.util.Collection;

public class Vacancy implements VacancyСreator {

        private Collection<Observer> observers = new ArrayList<>();


    @Override
    public void addVacancy(String companyName, int salary, String post) {

    }

    @Override
    public void removeVacancy(String companyName, int salary, String post) {

    }
}
