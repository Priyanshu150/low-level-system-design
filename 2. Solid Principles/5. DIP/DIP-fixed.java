interface PaymentGateway {

    PaymentResult charge(
            PaymentRequest request
    );
}

class StripePaymentGateway
        implements PaymentGateway {

    @Override
    public PaymentResult charge(
            PaymentRequest request) {

        System.out.println(
                "Calling Stripe API"
        );

        // Stripe-specific implementation

        return PaymentResult.success();
    }
}

class RazorpayPaymentGateway
        implements PaymentGateway {

    @Override
    public PaymentResult charge(
            PaymentRequest request) {

        System.out.println(
                "Calling Razorpay API"
        );

        // Razorpay-specific implementation

        return PaymentResult.success();
    }
}

class PaymentService {

    private final PaymentGateway paymentGateway;

    public PaymentService(
            PaymentGateway paymentGateway) {

        this.paymentGateway = paymentGateway;
    }

    public PaymentResult processPayment(
            PaymentRequest request) {

        return paymentGateway.charge(request);
    }
}