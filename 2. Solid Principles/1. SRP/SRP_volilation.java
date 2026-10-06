import java.math.BigDecimal;

class OrderService {
    public void placeOrder(Order order) {
        // 1. Calculate total
        BigDecimal total = calculateTotal(order);

        // 2. Save order
        saveOrderToDatabase(order, total);

        // 3. Generate invoice
        generateInvoice(order, total);

        // 4. Send email
        sendConfirmationEmail(order);

        // 5. Send analytics event
        sendAnalyticsEvent(order, total);

        System.out.println("Order placed successfully");
    }

    private BigDecimal calculateTotal(Order order) {

        BigDecimal total = order.getItems()
                .stream()
                .map(item -> item.getPrice()
                        .multiply(BigDecimal.valueOf(item.getQuantity())))
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        return total;
    }

    private void saveOrderToDatabase(Order order, BigDecimal total) {
        System.out.println("Saving order to MySQL...");
    }

    private void generateInvoice(Order order, BigDecimal total) {
        System.out.println("Generating PDF invoice...");
    }

    private void sendConfirmationEmail(Order order) {
        System.out.println("Sending email...");
    }

    private void sendAnalyticsEvent(Order order, BigDecimal total) {
        System.out.println("Sending event to analytics...");
    }
}