package sem_7.factory;

public class Freelancer extends Employee {


    public Freelancer(String name, String surName, double salary) {
        super(name, surName, salary);
    }

    @Override
    public double calculateSalary() {
        return 20.8 * 8 * salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s : Фрилансер среднемесячная зарплата %.2f, ставка в час %.2f\n",
                surName, name, calculateSalary(), salary);
    }
}
