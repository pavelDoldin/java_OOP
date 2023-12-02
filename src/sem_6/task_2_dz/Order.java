package sem_6.task_2_dz;


public class Order {


    /**
     * Имя клиента
     */
    protected String clientName;

    /**
     * Наименование продукта
     */
    protected String product;

    /**
     * Количество продуктов
     */
    protected int qnt;

    /**
     * Цена продукта
     */
    protected int price;

    public String getClientName() {
        return clientName;
    }

    public String getProduct() {
        return product;
    }

    public int getQnt() {
        return qnt;
    }

    public int getPrice() {
        return price;
    }

    public Order() {

    }

    public Order(String clientName, String product, int qnt, int price) {
        this.clientName = clientName;
        this.product = product;
        this.qnt = qnt;
        this.price = price;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public void setQnt(int qnt) {
        this.qnt = qnt;
    }

    public void setPrice(int price) {
        this.price = price;
    }


}














