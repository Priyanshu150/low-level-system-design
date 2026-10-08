interface Deliverable {
    void deliver(Order order);
}

interface CashCollector {
    void collectCash(BigDecimal amount);
}

interface ReturnPickupService {
    void pickupReturn(Order order);
}

interface ShipmentTracker {
    void trackShipment(String trackingId);
}

class DroneDeliveryPartner
        implements Deliverable, ShipmentTracker {

    @Override
    public void deliver(Order order) {

        System.out.println(
                "Delivering order using drone"
        );
    }

    @Override
    public void trackShipment(String trackingId) {

        System.out.println(
                "Tracking drone shipment: "
                        + trackingId
        );
    }
}

// normal delivery partner that can deliver, collect cash, pickup returns and track shipments
class DeliveryPartner
        implements Deliverable,
                   CashCollector,
                   ReturnPickupService,
                   ShipmentTracker {

    @Override
    public void deliver(Order order) {

        System.out.println(
                "Delivering order"
        );
    }

    @Override
    public void collectCash(BigDecimal amount) {

        System.out.println(
                "Collecting cash: " + amount
        );
    }

    @Override
    public void pickupReturn(Order order) {

        System.out.println(
                "Picking up return"
        );
    }

    @Override
    public void trackShipment(String trackingId) {

        System.out.println(
                "Tracking shipment: "
                        + trackingId
        );
    }
}