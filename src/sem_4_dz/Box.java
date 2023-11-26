package sem_4_dz;

import java.util.ArrayList;
import java.util.Comparator;

public class Box<T extends Fruit> {

    private ArrayList<T> fruits;
    private double weight;

    public Box() {
        this.fruits = new ArrayList<>();
    }


    public double getWeight() {
        return weight;
    }

    public void add(T fruit){
        fruits.add(fruit);
        weight = getWeight() + fruit.weight;
    }

    @Override
    public String toString() {
        return String.format("Вес коробки %.2f", weight);
    }

    boolean compare(Box box){
        if (weight == box.getWeight()){
            return true;
        }
        return false;
    }

    public void to(Box<T> box){
        for (T fruit : fruits) {
            box.add(fruit);
        }
    }

    //public class BoxComparator implements Comparator<Box> {
//
    //    @Override
    //    public int compare(Box o1, Box o2) {
    //        if (o1.weight > o2.weight){
    //            return 1;
    //        }
    //        else if (o1.weight == o2.weight){
    //            return 0;
    //        }
    //        return -1;
    //    }
    //}
//

    //public float getMaxBox() {
    //    return maxBox;
    //}

    //public ArrayList<T> getArrayList() {
    //    return arrayList;
    //}

    //public float getCurrentWeightBox() {
    //    return currentWeightBox;
    //}

    //public void addFruit(T fruit){
    //    if (currentWeightBox + 1 <= maxBox){
    //        arrayList.add(fruit);
    //        currentWeightBox++;
    //    }
    //   else {
    //       System.out.println("Коробка с фруктами полная ");
    //   }
    //}//
////
//
    //@Override
    //public String toString() {
    //    return String.format("Коробка с фруктами" );
    //}

    //private static Random random = new Random();
    //public static Box generateBox(){
//
    //    if ()

    //ArrayList fruit = new ArrayList<>();
//
//
    //fruit.add(random.nextInt(1, 25)); // сколько фруктов в коробке
//
    //System.out.println("фруктов в ящике" + fruit);
//
    //return new Box();

    //}

}
