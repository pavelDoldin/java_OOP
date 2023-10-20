package sem_2_1;

public abstract class Animal {

    private String name;


    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }

    public abstract void voice();


    public void jump(){
        System.out.println("Животное прыгает");
    }
}
