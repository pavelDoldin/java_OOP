package sem_2_1;

public class Cat extends Animal{

    private String color;

    public Cat(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void voice() {
        System.out.println("Котик мяу мяу");
    }

    @Override
    public void jump() {
        System.out.println("Котик прыгает");
    }
}
