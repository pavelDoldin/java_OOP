package sem_7.observer;

public class TimLide implements Observer {

    private String name;

    public TimLide(String name) {
        this.name = name;
    }

    private String post = "developer";

    private int salary = 100000;

    private int experience = 5;

    @Override
    public void receiveOffer(String nameCompany, int salary, String post, int experience) {
        if (this.salary <= salary && this.post.equals(post) && this.experience >= experience){
            System.out.printf("TimLide %s: Мне нужна эта работа! Компания %s, заралата: %d, опыт %d\n",
                    name, nameCompany, salary, experience);
            this.salary = salary;
            this.post = post;
            this.experience = experience;
        }
        else {
            System.out.printf("TimLide %s: Я найду работу получше! Компания %s, зарплата %d\n",
                    name, nameCompany, salary);
        }
    }

}
