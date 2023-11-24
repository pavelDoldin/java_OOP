package sem_4_1;

public class Program {
    public static void main(String[] args) {
        Person person1 = new Person("Иванько А.П.", "10_000_001");
        Entity entity1 = new Entity("OOO o", "10_000_002");


        CreditAccount<Person> creditAccount1 = new CreditAccount<>(person1, 30);
        DebitAccount<Entity> debitAccount1 = new DebitAccount<>(entity1, 3_000_000);

        var transaction = new Transaction<>(debitAccount1, creditAccount1, 20_000);

        transaction.execute();
        transaction.execute();
    }
}
