# Open/Closed Principle (OCP)

---

## Definition

> Software entities should be open for extension but closed for modification.

In simpler terms:

> You should be able to add new behaviour without repeatedly modifying stable, existing code.

---

## Important Interview Point

❌ **Don't say:** "OCP means we should never modify existing classes."

That's unrealistic. Every system gets modified at some point.

✅ **Say instead:** OCP means we should design the stable parts of the system so that new variations of behaviour can generally be introduced through extension rather than repeatedly modifying those stable parts.

> OCP is a design goal, not a rule that eliminates all modifications.

---

## How to spot a violation

Every time a new requirement arrives, you find yourself opening the same class and adding another `if` / `else if` block — that class is not closed for modification.