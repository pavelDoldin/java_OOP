package sem_7.builder;

public class Order {

    /**
     * Имя клиента
     */
    private String clientName;

    /**
     * Наименование компании
     */
    private String companyName;

    /**
     * Наименование продукта
     */
    private String productName;

    /**
     * Количество заказанных продуктов
     */
    private int qnt;

    /**
     * Стоимось
     */
    private double price;

    private boolean sign;

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQnt() {
        return qnt;
    }

    public void setQnt(int qnt) {
        this.qnt = qnt;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isSign() {
        return sign;
    }

    public void setSign(boolean sign) {
        this.sign = sign;
    }
}

















