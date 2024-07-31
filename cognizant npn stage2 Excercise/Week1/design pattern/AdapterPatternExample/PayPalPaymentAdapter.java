package AdapterPatternExample;

public class PayPalPaymentAdapter implements PaymentProcessor {
    private PayPalPaymentGateway payPalGateway;

    public PayPalPaymentAdapter(PayPalPaymentGateway payPalGateway) {
        this.payPalGateway = payPalGateway;
    }

    @Override
    public void processPayment(double amount) {
        payPalGateway.sendPayment(amount);
    }
}

