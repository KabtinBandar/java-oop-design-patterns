# Object-Oriented Programming (OOP) & Design Patterns in Java

A structured, clean-code Java repository demonstrating the fundamental pillars of **Object-Oriented Programming (OOP)**, architectural class design, polymorphic dispatch, interface contracts, and real-world domain simulations across **12 distinct engineering packages**.

---

## Core OOP Concepts Demonstrated

1. **Encapsulation & Data Hiding:** Private fields, defensive copying, validated getters/setters, state integrity.
2. **Inheritance & Reusability:** Parent-child hierarchies, `super` invocation, constructor chaining.
3. **Polymorphism & Dynamic Dispatch:** Method overriding, interface-based abstractions, runtime substitution.
4. **Abstraction:** Abstract base classes (`Animal`, `Shape`, `Product`), contract enforcement without implementation coupling.
5. **Interface Segregation:** Pure behavioral interfaces (`Movable`) implemented across geometric classes.
6. **Domain Modeling:** Realistic object simulations modeling commercial retail and e-learning ecosystems.

---

## Repository Modules

```
all_oop/src/
├── Animal/           # Abstract classes, method overriding (Animal -> Dog, Cat, BigDog)
├── Date/             # Temporal validation, day/month/year boundary handling
├── Movable/          # Interface polymorphism (Movable -> MovablePoint, MovableCircle)
├── Person/           # Inheritance hierarchy (Person -> Student, Staff)
├── Point/            # 2D & 3D coordinate geometry (Point2D, Point3D)
├── Point2/           # Composition & coordinate delegation (MovablePoint)
├── Product/          # Product classification (Product -> HardGoods, SoftGoods)
├── Shape/            # Geometric abstraction (Shape -> Circle, Rectangle -> Square)
├── Time/             # Time arithmetic and formatting (HH:MM:SS)
├── Vechicl/          # Transportation hierarchy and vehicle modeling
├── Website/          # E-Commerce Domain Simulation (JumiaSite, Cart, Product, Visitor)
└── Website2/         # E-Learning Domain Simulation (Coursera, Course, Lecture, Teacher)
```

---

## Compilation & Verification

Verified across modern Java compilers (**JDK 17, 21, and 25**):

```bash
# Compile all modules
javac -d bin src/*/*.java

# Run a specific demonstration (e.g. Jumia e-commerce simulation)
java -cp bin Website.JumiaSite

# Run the Coursera e-learning simulation
java -cp bin Website2.Coursera
```

---

## License
MIT License. Structured for academic reference and software engineering pedagogy.
