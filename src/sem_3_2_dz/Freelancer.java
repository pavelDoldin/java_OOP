package sem_3_2_dz;

/**
 * Фрелансер (с почасовой оплатой)
 */

public class Freelancer extends Employee{

    public Freelancer(String surName, String name, int age, double salary) {
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
        return String.format("%s %s : Фрелансер: Возраст %d :Средняя заробатная плата: %.2f рублей ",
                surName, name, age, salary);
    }
}
