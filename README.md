## Week 7 : Java Design Principles & Design Patterns

### Day 1 - Design Principles & Design Patterns
*(Date: 31-Jan-2026)*

- Studied the introduction to `design principles` and their importance in writing clean, maintainable, and scalable software.
- Learned the `Single Responsibility Principle` (SRP) to ensure a class has only one reason to change.
- Studied the `Open/Closed Principle (OCP)` to design classes that are open for extension but closed for modification.
- Understood the `Liskov Substitution Principle (LSP)` to ensure child classes can replace parent classes without breaking behavior.
- Learned the `Interface Segregation Principle (ISP)` to avoid forcing classes to implement unused methods.
- Studied the `Dependency Inversion Principle (DIP)` to reduce tight coupling by depending on abstractions instead of concrete implementations.
- Learned the `Don’t Repeat Yourself (DRY)` principle to eliminate code duplication and improve maintainability.
- Studied the `Keep It Simple, Stupid (KISS)` principle to keep solutions simple and easy to understand.
- Learned the `You Aren’t Gonna Need It (YAGNI)` principle to avoid adding unnecessary functionality prematurely.
- Explored the introduction to `GoF (Gang of Four) Design Patterns` and their role in solving common software design problems.
- Studied the categories of GoF design patterns including `creational`, `structural`, and `behavioral patterns`.
- Learned the `Singleton Pattern` to ensure a class has only one instance and provide a global access point.
- Studied the `Factory Pattern` to create objects without exposing instantiation logic to the client.
- Learned the `Observer Pattern` to define a one-to-many dependency between objects for event-based updates.
Studied the `Builder Pattern` to construct complex objects step by step with better readability.
Learned `UML designing` to visually represent system structure, relationships, and design patterns effectively.

🔗 *Link :* [Design Principles](https://github.com/sanya-modi/BridgeLabz-Training/tree/java-design-pattern-practice/java-design-pattern-practice/gcr-codebase/DesignConcepts/src/com/designprinciples/librarycasestudy) 

---

### Day 2 - Multi-Threading
*(Date: 02-Feb-2026)*

- Learned multithreading and how it allows concurrent execution of multiple tasks within a single process.
- Studied different ways to create threads using the `Thread` class and `Runnable` interface.
- Understood the thread lifecycle and commonly used thread methods.
- Learned daemon threads and their role in background tasks.
- Studied synchronization to prevent race conditions and ensure thread safety.
- Learned thread communication using `wait()`, `notify()`, and `notifyAll()`.
- Understood deadlock and techniques to avoid it.
- Studied `ReentrantLock` and compared it with synchronized blocks.

🔗 *Link :* [Multi-Threading](https://github.com/sanya-modi/BridgeLabz-Training/tree/java-design-pattern-practice/java-design-pattern-practice/gcr-codebase/DesignConcepts/src/com/multithreading) 

---

### Day 3 – Bank Transactions Using Multithreading
*(Date: 03-Feb-2026)*

- Solved a Java multithreading problem simulating concurrent bank transactions.
- Implemented a thread-safe Bank class with synchronised deposit, withdrawal, and balance operations to prevent race conditions.
- Created multiple Customer threads to perform transactions concurrently and verified correctness through final account balances.
- This exercise strengthened my understanding of thread creation, synchronisation, and real-world concurrency handling.

🔗 *Link :* [Multi-Threading Scenario](https://github.com/sanya-modi/BridgeLabz-Training/tree/java-design-pattern-practice/java-design-pattern-practice/scenario-based/ScenarioBasedProblem/src/com/banktransactionmultithreading)
