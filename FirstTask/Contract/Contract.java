
import java.util.Date;

public class Contract {
    private Customer customer;
    private Building building;
    private Date startDate;
    private Date endDate;
    private double totalPrice;
    private Payment payment;

    public Contract(Customer customer, Building building, Date startDate, Date endDate, Payment payment) {
        this.customer = customer;
        this.building = building;
        this.startDate = startDate;
        this.endDate = endDate;
        this.payment = payment;
        this.totalPrice = calculateTotalPrice();
    }

    private double calculateTotalPrice() {
        long rentalPeriod = endDate.getTime() - startDate.getTime();
        long days = rentalPeriod / (1000 * 60 * 60 * 24);
        return days * building.getPrice();
    }

    public Customer getCustomer() {
        return customer;
    }

    public Building getBuilding() {
        return building;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public Payment getPayment() {
        return payment;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "customer=" + customer.getName() +
                ", building=" + building.getName() +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", totalPrice=" + totalPrice +
                ", payment=" + payment.getPaymentType() +
                '}';
    }
}
