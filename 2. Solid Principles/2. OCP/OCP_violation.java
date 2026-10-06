import java.math.BigDecimal;

class PaymentService {

    public void processPayment(
            String paymentType,
            BigDecimal amount) {

        if (paymentType.equals("CREDIT_CARD")) {

            System.out.println(
                    "Processing credit card payment: " + amount
            );

        } else if (paymentType.equals("UPI")) {

            System.out.println(
                    "Processing UPI payment: " + amount
            );

        } else if (paymentType.equals("PAYPAL")) {

            System.out.println(
                    "Processing PayPal payment: " + amount
            );

        } else {

            throw new IllegalArgumentException(
                    "Unsupported payment method"
            );
        }
    }
}