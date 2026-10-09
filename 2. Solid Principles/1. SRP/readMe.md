# Single Responsibility Principle (SRP)

---

## Definition

> A class should have only one reason to change.

---

## Common Misconception

❌ **"A class should have only one method."**

That's not what SRP means. A class can have many methods and still follow SRP.

---

## How to think about it

Think in terms of **responsibilities** and **actors**.

A responsibility is a reason to change. If two different actors (e.g. the finance team and the HR team) could independently ask for changes to the same class, that class likely has more than one responsibility — and is violating SRP.

---

## How to spot a violation

If a class handles multiple responsibilities that can change independently of each other, it is likely violating SRP.