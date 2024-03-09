

Data abstraction is the process of hiding certain details and showing only essential information to the user.

Abstraction can be achieved with either abstract classes or interfaces.

The abstract keyword is a non-access modifier, used for classes and methods:

Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).

Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).

1. An instance of an abstract class can not be created.
2. Constructors are allowed.
3. We can have an abstract class without any abstract method.
4. There can be a final method in abstract class but any abstract method in class(abstract class) can not be declared as final  or in simpler terms final method can not be abstract itself as it will yield an error: “Illegal combination of modifiers: abstract and final”
5. We can define static methods in an abstract class.

# INTERFACE V ABSTRACT CLASS 

| Feature            | Abstract Class                                      | Interface                                              |
|--------------------|-----------------------------------------------------|--------------------------------------------------------|
| Definition         | Can have abstract and concrete methods              | Contains only method signatures (abstract by default)   |
| Inheritance        | Subclasses extend abstract classes                  | Classes implement interfaces                            |
|                    | Single inheritance (extends only one class)         | Multiple inheritance of type (implements multiple)      |
| Usage              | Provides common base implementation                 | Specifies a contract for classes to implement           |
|                    | Share code among related classes                    | Achieve loose coupling between classes                  |
| Constructor        | Can have constructors                              | Cannot have constructors (no instantiation)            |

# INTERFACE WITH STATIC METHOD CAN CONTAIN IT'S METHOD BODY
Eg:
```java 
interface MyInterface {
    // Abstract method
    void myMethod();

    // Static method with a body
    static void staticMethod() {
        System.out.println("This is a static method in MyInterface.");
    }
}

class MyClass implements MyInterface {
    // Implementation of abstract method
    public void myMethod() {
        System.out.println("Implementing myMethod.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Calling static method from interface
        MyInterface.staticMethod(); // Output: This is a static method in MyInterface.

        // Creating an object of implementing class
        MyClass obj = new MyClass();
        obj.myMethod(); // Output: Implementing myMethod.
    }
}

```