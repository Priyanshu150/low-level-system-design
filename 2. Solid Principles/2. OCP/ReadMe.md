The principle says:
Software entities should be open for extension but closed for modification.

In simpler terms:
You should be able to add new behavior without repeatedly modifying stable, existing code.

This is an important interview point.
You should not say:
❌ "OCP means we should never modify existing classes."

That's unrealistic.
Instead:
OCP means we should design stable parts of the system so that new variations of behavior can generally be introduced through extension rather than repeatedly modifying those stable parts.

OCP is a design goal, not a magical rule that eliminates all modifications.