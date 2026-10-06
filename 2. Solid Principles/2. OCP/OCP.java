import java.math.BigDecimal;

interface PaymentProcessor {

    PaymentResult process(BigDecimal amount);
}

class CreditCardPaymentProcessor
        implements PaymentProcessor {

    @Override
    public PaymentResult process(BigDecimal amount) {

        System.out.println(
                "Processing credit card payment: " + amount
        );

        // Credit card specific logic

        return PaymentResult.success();
    }
}

class UpiPaymentProcessor
        implements PaymentProcessor {

    @Override
    public PaymentResult process(BigDecimal amount) {

        System.out.println(
                "Processing UPI payment: " + amount
        );

        // UPI specific logic

        return PaymentResult.success();
    }
}

class PayPalPaymentProcessor
        implements PaymentProcessor {

    @Override
    public PaymentResult process(BigDecimal amount) {

        System.out.println(
                "Processing PayPal payment: " + amount
        );

        // PayPal specific logic

        return PaymentResult.success();
    }
}

// add new payment method without modifying existing code
class ApplePayPaymentProcessor
        implements PaymentProcessor {

    @Override
    public PaymentResult process(BigDecimal amount) {

        System.out.println(
                "Processing Apple Pay payment: " + amount
        );

        // Apple Pay specific logic

        return PaymentResult.success();
    }
}

class PaymentService {

    public PaymentResult processPayment(
            PaymentProcessor processor,
            BigDecimal amount) {

        return processor.process(amount);
    }
}

// Uses 

PaymentService paymentService = new PaymentService();

PaymentProcessor processor =
        new CreditCardPaymentProcessor();

paymentService.processPayment(
        processor,
        new BigDecimal("5000")
);

PaymentProcessor processor =
        new UpiPaymentProcessor();

paymentService.processPayment(
        processor,
        new BigDecimal("1500")
);

PaymentProcessor processor =
        new ApplePayPaymentProcessor();

paymentService.processPayment(
        processor,
        new BigDecimal("2500")
);