package dz_1;


import java.util.List;

public class VendingMachine {

    private List<Product> products;


    public VendingMachine(List<Product> products) {
        this.products = products;

    }

    //public BottleOfMilk getBottleOfMilk(String name, double volume) {
    //    for (Product product : products) {
    //        if (product instanceof BottleOfMilk) {
    //            BottleOfMilk bottleOfMilk = (BottleOfMilk) product;
    //            if (bottleOfMilk.getName().equals(name) && bottleOfMilk.getVolume() == volume) {
    //                return bottleOfMilk;
    //            }
    //        }
    //    }
    //    return null;
    //}
    public PackageOfPotatoes packageOfPotatoes(String name, double price){
        for (Product products : products) {
            if (products instanceof PackageOfPotatoes){
                PackageOfPotatoes packageOfPotatoes = (PackageOfPotatoes) products;
                if (packageOfPotatoes.getName().equals(name) && packageOfPotatoes.getPrice() == price){
                    return packageOfPotatoes;
                }
            }
        }
        return null;
    }

}
