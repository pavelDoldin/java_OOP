package sem_3_2_dz;
/**
 *Рабочий (базовый тип)
 */
public abstract class Employee implements Comparable<Employee> {

    @Override
    public int compareTo(Employee o) {
        int surNameRes = surName.compareTo(o.surName);
        if (surNameRes == 0){
            return name.compareTo(o.name);
        }
        return surNameRes;
    }

    public Employee(String surName, String name, int age, double salary) {
        this.name = name;
        this.surName = surName;
        this.salary = salary;
        this.age = age;
    }

    /**
     * Имя
     */

    protected String name;

    /**
     * Фамилия
     */

    protected String surName;


    /**
     * Возраст работник
     */

    protected int age;

    /**
     * Зарплата
     */
    protected double salary;

    /**
     * Расчёт среднемесячной заработной платы
     *
     */
    public abstract double calculateSalary();

    public abstract int ageEmployee();


    @Override
    public String toString() {
       return String.format("%s %s: возраст: %d ставка в час %.2f в месяц %.2f ", surName, name, age, salary, calculateSalary());
    }
}
