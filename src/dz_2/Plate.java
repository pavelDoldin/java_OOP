package dz_2;
public class Plate {
    protected int food;


    public Plate(int food) {
        checkFood(food);
    }


    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }


    private void checkFood(int food){
        if (food < 0){
            System.out.println("Еда не может быть отрицательным");
        }
        else {
            this.food = food;
        }
    }
    public void info() {
        System.out.println("plate: " + food);
    }
}