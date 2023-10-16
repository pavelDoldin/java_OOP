package dz_1;

public class PackageOfPotatoes extends Product{
    private String weight;  // вес масса
    private String taste;  // вкус

    public String getWeight() {
        return weight;
    }

    public String getTaste() {
        return taste;
    }


    public PackageOfPotatoes(String brand, String name, double price, String weight, String taste){
        super(brand, name, price);
        this.taste = taste;
        this.weight = weight;
    }

    @Override
    public String displayInfo() {
        return String.format("%s - %s - %.2f - %s - %s", brand, name, price,taste,weight);
    }
}
