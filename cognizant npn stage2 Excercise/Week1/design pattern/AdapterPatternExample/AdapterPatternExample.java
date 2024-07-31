package AdapterPatternExample;
public class AdapterPatternExample {
    public static void main(String[] args) {
        PayPalPaymentGateway payPal = new PayPalPaymentGateway();
        PaymentProcessor processor = new PayPalPaymentAdapter(payPal);
        processor.processPayment(15000.00);
    }
}

