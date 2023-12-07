package sem_7.observer;

import java.util.Random;

public class Company {

    private Random random = new Random();

    private String name;

    private Publisher jopAgency;

    private int maxSalary;

    private String post;

    private int experience;

    public Company(String name, Publisher jopAgency, int maxSalary, String post, int experience) {
        this.name = name;
        this.jopAgency = jopAgency;
        this.maxSalary = maxSalary;
        this.post = post;
        this.experience = experience;
    }

    public void needEmployee(){
        int salary = random.nextInt(maxSalary);
        jopAgency.sendOffer(name, salary, post, experience);
    }
}
