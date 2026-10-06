class OrderPricingService {

    public BigDecimal calculateTotal(Order order) {

        return order.getItems()
                .stream()
                .map(item ->
                        item.getPrice()
                                .multiply(BigDecimal.valueOf(item.getQuantity())))
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}

class OrderRepository {

    public void save(Order order, BigDecimal total) {
        System.out.println("Saving order to database...");
    }
}

interface OrderRepository {
    void save(Order order);
}

class JpaOrderRepository implements OrderRepository {

    @Override
    public void save(Order order) {
        // JPA implementation
    }
}

class InvoiceService {

    public void generateInvoice(Order order, BigDecimal total) {
        System.out.println("Generating invoice...");
    }
}

interface NotificationService {

    void sendOrderConfirmation(Order order);
}

class EmailNotificationService implements NotificationService {

    @Override
    public void sendOrderConfirmation(Order order) {
        System.out.println("Sending order confirmation email...");
    }
}

class SmsNotificationService implements NotificationService {

    @Override
    public void sendOrderConfirmation(Order order) {
        System.out.println("Sending SMS...");
    }
}

interface AnalyticsService {

    void trackOrder(Order order, BigDecimal total);
}

class KafkaAnalyticsService implements AnalyticsService {

    @Override
    public void trackOrder(Order order, BigDecimal total) {
        System.out.println("Publishing order event to Kafka...");
    }
}


class OrderService {

    private final OrderPricingService pricingService;
    private final OrderRepository orderRepository;
    private final InvoiceService invoiceService;
    private final NotificationService notificationService;
    private final AnalyticsService analyticsService;

    public OrderService(
            OrderPricingService pricingService,
            OrderRepository orderRepository,
            InvoiceService invoiceService,
            NotificationService notificationService,
            AnalyticsService analyticsService) {

        this.pricingService = pricingService;
        this.orderRepository = orderRepository;
        this.invoiceService = invoiceService;
        this.notificationService = notificationService;
        this.analyticsService = analyticsService;
    }

    public void placeOrder(Order order) {

        BigDecimal total = pricingService.calculateTotal(order);

        orderRepository.save(order, total);

        invoiceService.generateInvoice(order, total);

        notificationService.sendOrderConfirmation(order);

        analyticsService.trackOrder(order, total);
    }
}

