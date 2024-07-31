package AdapterPatternExample;

public class PayPalPaymentGateway {
    public void sendPayment(double amount) {
        System.out.println("Payment of amount=" + amount + "via PayPal.");
    }
}

