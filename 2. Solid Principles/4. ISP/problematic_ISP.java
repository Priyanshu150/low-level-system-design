interface FulfillmentPartner {

    void deliver(Order order);

    void collectCash(BigDecimal amount);

    void pickupReturn(Order order);

    void trackShipment(String trackingId);
}

class DroneDeliveryPartner
        implements FulfillmentPartner {

    @Override
    public void deliver(Order order) {
        System.out.println(
                "Delivering order using drone"
        );
    }

    @Override
    public void collectCash(BigDecimal amount) {

        throw new UnsupportedOperationException(
                "Drone cannot collect cash"
        );
    }

    @Override
    public void pickupReturn(Order order) {

        throw new UnsupportedOperationException(
                "Drone cannot pickup returns"
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