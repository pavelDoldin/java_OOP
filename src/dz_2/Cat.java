package dz_2;
public class Cat {
    private String name; // Имя
    private int appetite; // Апетит
    private int satiety;  //Сытость

    public Cat(String name, int appetite, int satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public int getSatiety() {
        return satiety;
    }

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }



    public void eat(Plate plate) {
        if (appetite < 0 || satiety < 0 || plate.food < 0){
            System.out.println("Апетит, сытость или еда не должна быть меньше нуля " + name);
        }
        else if (appetite == 0 && satiety == 100 && plate.food > 0){
            System.out.println("Котик " + name + " не хочет кушать");
        } else if (appetite == 100 && satiety == 0 && plate.food < 100) {
            System.out.println("Котик " + name + " хочет кушать но мало еды, доложите корм");
        }
        else if (appetite == 100 && satiety == 0 && plate.food > 100){
            System.out.println("Котик " + name + " хочет кушать но еды много, убавте корм");
        }
        else if (appetite == 100 && satiety == 0 && plate.food == 100){
            System.out.println("Котик " + name + " поел и стал сытым :)");
        }
        else if (appetite < plate.food){
            System.out.println("В тарелке у " + name + " много еды нужно убрать корм");
        }
        else if (appetite > plate.food){
            System.out.println("В тарелке у " + name + " мало еды нужно доложить корм");
        }
        else {
            System.out.println("Котик " + name + " покушал и стал сытым :)");
        }

    }
}













