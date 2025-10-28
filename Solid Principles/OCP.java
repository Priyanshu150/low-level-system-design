// Scenario: Imagine a billing system for an e-commerce website that calculates discounts. 
// Initially, it only includes a “Holiday Discount.” Later, the business wants to add new discounts—like a 
// “Loyalty Discount” or a “Flash Sale Discount”—without risking bugs in the holiday logic.

// violating the rule 
public double calculateDiscount(Order order) {
    if (order.isHoliday()) {
        // Holiday Discount logic
    } else if (order.isLoyalCustomer()) {
        // Loyalty Discount logic
    }
    // More discount types added here...
}

// making the previous code OCP valid 
public interface Discount {
    double apply(Order order);
}

public class HolidayDiscount implements Discount {
    public double apply(Order order) { /* holiday discount logic */ }
}

public class LoyaltyDiscount implements Discount {
    public double apply(Order order) { /* loyalty discount logic */ }
}

public double calculateTotalDiscount(Order order, List<Discount> discounts) {
    double total = 0;
    for (Discount d : discounts) total += d.apply(order);
    return total;
}
