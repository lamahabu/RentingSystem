public class Customer extends Human{
    Payment paymentType;
    public Customer(Payment paymentType, String name, int age, int Id, String number) {
        super(name, age, Id, number);
        this.paymentType = paymentType;
    }

    public Payment getPaymentType() {
        return paymentType;
    }

}
