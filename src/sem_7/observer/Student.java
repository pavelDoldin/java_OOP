package sem_7.observer;

public class Student implements Observer {

    private String name;

    public Student(String name) {
        this.name = name;
    }


    private String post;


    private int salary = 2000;

    private int experience = 0;

    @Override
    public void receiveOffer(String nameCompany, int salary, String post, int experience) {

        if (this.salary <= salary && this.experience >= experience){
            System.out.printf("Студент %s: Мне нужна эта работа! Компания %s, заралата: %d,\n",
                    name, nameCompany, salary);
            this.salary = salary;
            this.post = post;
            this.experience = experience;
        }
        else {
            System.out.printf("Студент %s: Я найду работу получше! Компания %s, зарплата %d\n",
                    name, nameCompany, salary, experience);
        }
    }
}
