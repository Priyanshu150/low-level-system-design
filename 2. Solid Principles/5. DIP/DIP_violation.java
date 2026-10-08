class PaymentService {

    private final StripePaymentGateway gateway;

    public PaymentService() {

        this.gateway =
                new StripePaymentGateway();
    }

    public void processPayment(
            PaymentRequest request) {

        gateway.charge(request);
    }
}

// Note: Introducing a new payment gateway would require modifying the PaymentService class, 
// which violates the Dependency Inversion Principle (DIP).