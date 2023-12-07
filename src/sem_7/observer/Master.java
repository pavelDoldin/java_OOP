package sem_7.observer;

public class Master implements Observer {

    private String name;

    public Master(String name) {
        this.name = name;
    }

    private String post = "учитель";
    private int salary = 80000;

    private int experience = 3;

    @Override
    public void receiveOffer(String nameCompany, int salary, String post, int experience) {
        if (this.salary <= salary && this.post.equals(post) && this.experience <= experience){
            System.out.printf("Мастер %s: Мне нужна эта работа! Компания %s, заралата: %d, опыт %d\n",
                    name, nameCompany, salary, experience);
            this.salary = salary;
            this.post = post;
            this.experience = experience;
        }
        else {
            System.out.printf("Мастер %s: Я найду работу получше! Компания %s, зарплата %d\n",
                    name, nameCompany, salary);
        }
    }
}
