public class StrategyPatternExample {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        context.setPaymentStrategy(new CreditCardPayment("5556-9678-9877-1031"));
        context.pay(1000);

        context.setPaymentStrategy(new PayPalPayment("example@paypal.com"));
        context.pay(1500);
    }
}
