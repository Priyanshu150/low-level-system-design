# Interface Segregation Principle (ISP)

---

## Definition

> A class should not be forced to depend on methods it does not need.

Prefer several small, focused interfaces over one large "do-everything" interface.

---

## How to spot a violation

If a class implementing an interface has to:
- Write empty method bodies
- Throw `UnsupportedOperationException`
- Implement methods that are irrelevant to it

— the interface is too broad.

---

## Interview Answer

> "The Interface Segregation Principle states that clients should not be forced to depend on methods they don't use. Instead of creating large interfaces with unrelated capabilities, we should create smaller, focused interfaces so that implementations depend only on the functionality they actually need."

**Example to give:**

Instead of a single `DeliveryPartner` interface containing `deliver`, `collectCash`, `pickupReturn`, and `trackShipment` — separate these into capability-based interfaces.

- A **drone** implements only `Deliverable` and `ShipmentTracker`
- A **courier** implements additional capabilities like `CashCollectable` and `ReturnPickup`

Each implementor takes only what it needs.