import java.util.Date;

public class main {
    public static void main(String[] args) {
        BuildingOwner owner = new BuildingOwner("Mohammmad", 45, 123456, "123-456-7890");
        Building Apartment = new Apartment("123 Main St", owner, "Apartment1", 100, 1000);
        Payment payment = new CreditCard("1234567890123456", "Lama", "Visa");

        Customer customer = new Customer(payment, "Sahar", 30, 654321, "987-654-3210");

        Date startDate = new Date(2023, 1, 1);
        Date endDate = new Date(2023, 1, 10);

        Contract contract = new Contract(customer, Apartment, startDate, endDate, payment);

        System.out.println(contract);
    }
}
