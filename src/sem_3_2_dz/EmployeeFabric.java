package sem_3_2_dz;

import java.util.Random;

public class EmployeeFabric {

    private static Random random = new Random();


    public static Worker generateWorker() {
        String[] names = new String[]{"Павел", "Андрей", "Елена", "Анатолий", "Евгений",
                "Елизавета", "Екатерина", "Мурат", "Иван", "Глеб"};

        String[] surNames = new String[]{"Лысов", "Артемев", "Шубин", "Русских", "Журавлёв",
                "Путин", "Палкин", "Волегов", "Медведев", "Писков"};

        int salary = random.nextInt(60000, 120001);

        int age = random.nextInt(20, 55);


        return new Worker(surNames[random.nextInt(surNames.length)],
                names[random.nextInt(names.length)],
                age, salary);

    }


    public static Freelancer generateFreelancer() {
        String[] names = new String[]{"Павел", "Андрей", "Елена", "Анатолий", "Евгений",
                "Елизавета", "Екатерина", "Мурат", "Иван", "Глеб"};

        String[] surNames = new String[]{"Лысов", "Артемев", "Шубин", "Русских", "Журавлёв",
                "Путин", "Палкин", "Волегов", "Медведев", "Писков"};

        double salary = 20.8 * 8 * random.nextInt(500, 800);

        int age = random.nextInt(20, 55);

        return new Freelancer(surNames[random.nextInt(surNames.length)],
                names[random.nextInt(names.length)],
                age, salary);
    }


}






















