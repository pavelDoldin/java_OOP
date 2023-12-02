package sem_6.task_4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class Program {

    public static void main(String[] args) {


        Birt birt1 = new Birt();
        Birt birt2 = new Birt();
        Birt birt3 = new Birt();
        Birt birt4 = new Birt();

        Duck duck1 = new Duck();
        Duck duck2 = new Duck();

        Penguin penguin1 = new Penguin();
        Penguin penguin2 = new Penguin();

        Collection<Birt> birts = new ArrayList<>();
        birts.add(birt1);
        birts.add(birt2);
        birts.add(birt3);
        birts.add(birt4);
        birts.add(duck1);
        birts.add(duck2);
        birts.add(penguin1);
        birts.add(penguin2);

        processFly(birts);
    }
    public static void processFly(Collection<Birt> birts){
        for (Birt birt : birts) {
            if (birt.isCanFly())
                birt.fly();
        }
    }


}
