package sem_4_1;

public abstract class Account<T

        > {

    /**
     * Инфа Клиента
     */
    private T data;

    /**
     * Сумма клиента
     */
    private double amount;

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public T getData() {
        return data;
    }

    public double getAmount() {
        return amount;
    }

    public Account(T data, double amount) {
        this.data = data;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return String.format("Клиент: %s; Сумма: %.2f руб. ", data, amount);
    }
}
