package sem_7.factory;

public class Worker extends Employee {

    public Worker(String name, String surName, double salary) {
        super(name, surName, salary);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s : Рабочий  Зарплата за месяц %.2f\n ",
                surName, name, salary);
    }
}
