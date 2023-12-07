package sem_7.observer;

public class Program {
    public static void main(String[] args) {

        /**
         * TODO : Доработать приложение, которое разрабатывалось на семинаре,
         * поработать с шаблоном проектирования Observer,
         * добавить новый тип соискателя.
         * Добавить новую сущность "Вакансия", компания должна рассылать вакансии.
         * Только после этого вы можете усложнить ваше приложение (при желании), например,
         * добавить тип вакансии (enum), учитывать тип вакансии при отправке предложения соискателю.
         */

        Publisher publisher = new JopAgency();
        Company google = new Company("Google", publisher, 150000, "developer", 4);
        Company yandex = new Company("Yandex", publisher, 5000, "уборщик", 0);
        Company geekBrains = new Company("GeekBrains", publisher, 150000, "учитель", 3);

        Student student1 = new Student("Студент 1");

        Master master1 = new Master("Мастер 1");
        Master master2 = new Master("Мастер 2");

        TimLide timLide1 = new TimLide("Pavel");


        publisher.registerObserver(student1);
        publisher.registerObserver(master1);
        publisher.registerObserver(master2);
        publisher.registerObserver(timLide1);

        for (int i = 0; i < 3; i++) {
            google.needEmployee();
            yandex.needEmployee();
            geekBrains.needEmployee();
            System.out.println();
        }

        Vacancy vacancy = new Vacancy();
        vacancy.addVacancy("LG", 100000, "developer");
        vacancy.addVacancy("Panasonic", 80000, "тестировщик");
        vacancy.addVacancy("Goznak", 50000, "моляр");

    }
}
