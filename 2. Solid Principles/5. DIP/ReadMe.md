# DIP vs DI

---

## Dependency Inversion Principle (DIP)

> High-level modules should not depend on low-level modules. Both should depend on abstractions.

> Abstractions should not depend on details. Details should depend on abstractions.

`OrderService` should depend on an `OrderRepository` interface rather than directly on `MySQLOrderRepository`. The concrete implementation is injected from outside. This reduces coupling, improves testability, and allows infrastructure to change without modifying business logic.

---

## DIP vs DI

| | |
|---|---|
| **DIP** | Design principle — dependencies should point toward abstractions |
| **DI** | Technique — the mechanism used to supply those dependencies from outside |

DI is how you achieve DIP in practice.

> 💡 **Testing benefit:** since the dependency is injected, a `MockOrderRepository` can be passed in tests without changing `OrderService`.