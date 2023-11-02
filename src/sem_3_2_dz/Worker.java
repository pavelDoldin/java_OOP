package sem_3_2_dz;

/**
 * Рабочий (работает всю смену, c 9 - 18)
 * зарплата фиксированная за месяц
 */

public class Worker extends Employee {

    public Worker(String surName, String name, int age, double salary) {
        super(surName, name, age, salary);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public int ageEmployee() {
        return age;
    }

    @Override
    public String toString() {
        return String.format("%s %s: Рабочий: Возраст %d Средняя заробатная плата: %.2f рублей ",
                surName, name, age, calculateSalary());
    }
}
