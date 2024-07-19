public class CreditCard extends Payment {
    private String cardNumber;
    private String cardHolderName;
    private String cardType; // Visa or MasterCard

    public CreditCard(String cardNumber, String cardHolderName, String cardType) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.cardType = cardType;
    }

    @Override
    public String getPaymentType() {
        return cardType;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }
}
