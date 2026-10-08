# Liskov Substitution Principle (LSP)

---

## Definition

> Objects of a child class should be usable wherever objects of the parent class are expected, without breaking the correctness of the program.

In simpler terms:

> If B is a subtype of A, replacing A with B should not cause unexpected behaviour.

---

## Rules to Follow

### 1. Signature Rule
The subclass method signatures must be compatible with the parent — same parameter types and return types. The subclass should not require stricter inputs or produce weaker outputs than the parent declares.

### 2. Property Rule
The subclass must honour the invariants of the parent class. Any property that holds true for the parent must continue to hold true for the subclass.

### 3. Method Rule
The subclass should not weaken preconditions or strengthen postconditions. It should not throw new unexpected exceptions or silently ignore behaviour that the parent guarantees.

---

## How to spot a violation

- A subclass throws `UnsupportedOperationException` for an inherited method
- A subclass overrides a method but does nothing inside it
- Code checks `instanceof` before calling a method — meaning not all subtypes can be treated the same way