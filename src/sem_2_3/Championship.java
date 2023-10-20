package sem_2_3;

public class Championship {
    public static void main(String[] args) {
        Runner[] runners = {
                new Cat("Макс", 1500, 300),
                new Cat("Шельма", 1700, 220),

                new Human("Павел", 4000, 350),
                new Human("Елена", 3500, 250),

                new Robot("Оптимус Прайм", 99999, 0),
                new Robot("Бамболби", 5000, 50)
        };

        Obstacle[] obstacles = {
                new Track(1200),
                new Wall(30),
                new Track(2000),
                new Wall(140),
                new Track(3000),
                new Wall(250),
        };

        for (Runner runner : runners) {
            for (Obstacle obstacle : obstacles) {
                if (obstacle instanceof Track){
                    if(!runner.run(obstacle.getLength()))
                        break;
                }
                else if (obstacle instanceof Wall){
                    if(!runner.jump(obstacle.getHeight()))
                        break;
                }
            }
        }
    }
}


















