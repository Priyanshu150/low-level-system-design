# 🏛️ SOLID Principles

> **Design Thinking — Foundation**

SOLID is a set of five design principles that make object-oriented code easier to understand, extend, and maintain.

---

## 📌 Table of Contents

- [The Five Principles](#the-five-principles)
- [Quick Self-Check Questions](#quick-self-check-questions)
- [All Five in One Example — Payment Gateway](#all-five-in-one-example--payment-gateway)

---

## The Five Principles

```
┌───────────────────────────────────────────────┐
│                    SOLID                      │
├───────────────────────────────────────────────┤
│                                               │
│ S → Single Responsibility                     │
│     One class → one reason to change          │
│                                               │
│ O → Open/Closed                               │
│     Extend behavior without repeatedly        │
│     modifying stable code                     │
│                                               │
│ L → Liskov Substitution                       │
│     Subtypes must honor their abstraction     │
│                                               │
│ I → Interface Segregation                     │
│     Don't force clients to depend on          │
│     unused capabilities                       │
│                                               │
│ D → Dependency Inversion                      │
│     Business logic depends on abstractions,   │
│     not implementation details                │
│                                               │
└───────────────────────────────────────────────┘
```
---

## Quick Self-Check Questions

Use these when reviewing any class or design decision:

| Principle | Question to ask yourself |
|---|---|
| **S** | Is my class doing too much? |
| **O** | Can I add behaviour without constantly changing existing code? |
| **L** | Can my subtype really behave like its parent? |
| **I** | Am I forcing clients to depend on things they don't need? |
| **D** | Is my business logic coupled to implementation details? |

---

## All Five in One Example — Payment Gateway

The Payment Gateway system is a natural showcase for all five principles simultaneously:

```
PaymentService
    │
    └── PaymentGateway (interface)
              │
              ├── StripeGateway
              └── RazorpayGateway
```

| Principle | How it applies |
|---|---|
| **SRP** | `PaymentService` handles payment orchestration only — Stripe API details live in `StripeGateway` |
| **OCP** | New payment gateways (`Razorpay`, `PayPal`) can be added without modifying `PaymentService` |
| **LSP** | `StripeGateway` and `RazorpayGateway` must fully honour the `PaymentGateway` contract |
| **ISP** | `PaymentGateway` interface stays focused — unrelated operations (e.g. invoicing) belong in their own interface |
| **DIP** | `PaymentService` depends on `PaymentGateway` (abstraction), not `StripeGateway` (implementation) |