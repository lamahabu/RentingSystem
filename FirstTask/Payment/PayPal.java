public class PayPal extends Payment {
    private String email;

    public PayPal(String email) {
        this.email = email;
    }

    @Override
    public String getPaymentType() {
        return "PayPal";
    }

    public String getEmail() {
        return email;
    }
}