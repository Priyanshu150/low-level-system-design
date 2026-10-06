class DeliveryPartner {

    public void deliver(Order order) {
        System.out.println(
                "Delivering order to customer"
        );
    }

    public void collectCash(BigDecimal amount) {
        System.out.println(
                "Collecting cash: " + amount
        );
    }
}

class BikeDeliveryPartner
        extends DeliveryPartner {

    @Override
    public void deliver(Order order) {
        System.out.println(
                "Delivering order using bike"
        );
    }
}

class DroneDeliveryPartner
        extends DeliveryPartner {

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
}