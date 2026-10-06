interface CashCollector {
    void collectCash(BigDecimal amount);
}

interface DeliveryPartner {
    void deliver(Order order);
}


class BikeDeliveryPartner
        implements DeliveryPartner, CashCollector {

    @Override
    public void deliver(Order order) {
        System.out.println(
                "Delivering using bike"
        );
    }

    @Override
    public void collectCash(BigDecimal amount) {
        System.out.println(
                "Collecting cash: " + amount
        );
    }
}

class DroneDeliveryPartner
        implements DeliveryPartner {

    @Override
    public void deliver(Order order) {
        System.out.println(
                "Delivering using drone"
        );
    }
}