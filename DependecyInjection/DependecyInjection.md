# TABLE OF CONTENTS:

## [1. Tight Coupling in Java](#1-tight-coupling-in-java)
## [2. What is Dependency Injection?](#2-what-is-dependency-injection)
- [Types of Dependency Injection](#types-of-dependency-injection)
- [Advantages of Dependency Injection](#advantages-of-dependency-injection)
## [3. Best Example Illustration of DI in Java](#best-example-illustration-of-di-in-java)


# 1. Tight Coupling in Java :

Tight coupling in software development refers to a situation where two or more components are highly dependent on each other. This means that a change in one component may require changes in other components, making the system less flexible and harder to maintain. Let's illustrate tight coupling with a simple Java example, and then we'll discuss how to reduce it using dependency injection.

### Tight Coupling Example in Java:
Consider a scenario where we have a `Car` class that depends on a `Engine` class. Here's how it might look with tight coupling:

```java
// Engine class
public class Engine {
    public void start() {
        System.out.println("Engine started");
    }
}
```

```java
// Car class with tight coupling
public class Car {
    private Engine engine;

    public Car() {
        this.engine = new Engine(); // Tight coupling
    }

    public void start() {
        engine.start(); // Using Engine directly
    }
}
```

``` java
// Main class
public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
    }
}
```
In this example, the `Car` class is tightly coupled to the `Engine` class because it directly creates an instance of Engine within its constructor. If the `Engine` class changes (e.g., method names, parameters), the Car class might need to be updated as well.

# 2. What is Dependency Injection?
Dependency Injection (DI) is a way of organizing your code to make it more flexible and easier to manage. It helps you build software that's easier to test, maintain, and extend.

### Why Do We Need It?
In traditional coding, objects often create or find their own dependencies. This leads to tightly coupled code, making it hard to make changes without affecting other parts of the code.

Dependency Injection flips this approach by having objects receive their dependencies from an external source. This makes the code more modular and flexible.

### How Does It Work?

Imagine you have a `Car` object that needs an `Engine` to run. Instead of the `Car` creating its own `Engine`, you give the `Car` an `Engine` from outside.

 For example, we have a `Car` class that needs an `Engine` to function.

In traditional coding, we might create the Engine object inside the Car class like this:

```java
public class Car {
    private Engine engine;

    public Car() {
        this.engine = new Engine(); // Creating Engine internally
    }
}
```

This tightly couples the `Car` class with the `Engine` class. If the `Engine` class changes, the `Car` class needs to be updated too. Plus, it's hard to test the `Car` class in isolation.

Instead of creating the Engine internally, let's pass it into the Car from outside. We'll do this through the constructor.

Here's how we can modify the Car class to accept an Engine through its constructor:

```java
public class Car {
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine; // Accepting Engine from outside
    }
}
```
Now, when we create a Car, we'll also provide the Engine it needs:

```java
public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine(); // Creating Engine
        Car car = new Car(engine);    // Creating Car with Engine
    }
}
```

### Types of Dependency Injection:

- Constructor Injection (recommended): You pass dependencies to a class through its constructor.

``` java
public class Car {
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }
}
```

- Setter Injection: Dependencies are set through setter methods.

``` java
public class Car {
    private Engine engine;

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
```
### Advantages of Dependency Injection:

- Improved Testability: Makes it easier to test because you can replace real dependencies with mock objects.
- Enhanced Maintainability: Changes in one part of the code don't necessarily affect other parts.
- Scalability: Allows for easier scaling and expansion of the system.
- Reduction of Code Duplication: Helps streamline dependency management, reducing redundant code.

Dependency Injection is a powerful technique for building cleaner, modular, and maintainable code. It's closely related to Inversion of Control (IoC), where control of flow is externalized. By understanding and implementing DI, developers can create software that's easier to work with and adapt to changing requirements.

# Best Example Illustration of DI in Java

Let's suppose we have a `Car` class that uses different types of engines(e.g: `PetrolEngine`, `ElectricEngine`). 

We use `Engine` interface here as well for more maintainablity of our code, where the  `PetrolEngine` class and `ElectricEngine` class implements the `Engine` interface. 

Then, when we create a `Car`, we can choose which type of engine to use by providing the corresponding implementation through dependency injection.

```java
// Engine interface
public interface Engine {
    void start();
}
```

```java
// PetrolEngine class implementing Engine interface
public class PetrolEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Starting Petrol Engine");
    }
}
```

```java
// ElectricEngine class implementing Engine interface
public class ElectricEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Starting Electric Engine");
    }
}
```

```java
// Car class with dependency injection
public class Car {
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine; // Injecting Engine from outside
    }

    public void start() {
        engine.start(); // Using the provided Engine
    }
}
```

```java
// Main class
public class Main {
    public static void main(String[] args) {
        // Creating different types of engines
        Engine petrolEngine = new PetrolEngine();
        Engine electricEngine = new ElectricEngine();

        // Creating cars with different engines
        Car petrolCar = new Car(petrolEngine);
        Car electricCar = new Car(electricEngine);

        // Starting the cars
        petrolCar.start();
        electricCar.start();
    }
}
```
