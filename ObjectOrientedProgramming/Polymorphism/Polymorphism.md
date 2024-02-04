# Polymorphism in Java

Polymorphism is one of the core concepts in object-oriented programming (OOP), allowing objects of different types to be treated as objects of a common type.
- allows us to perform single action in different ways.
- having forms
- allows us to define one interface & have multiple implementation.

Polymorphism can be achieved through two main types: compile-time polymorphism and runtime polymorphism.

*Note: Java doesn't support operator overloading, which is compile time polymorphism in C++*

## 1. Compile-Time Polymorphism (Static)

    a. Function or Method Overloading

    Function overloading is a form of compile-time polymorphism where multiple methods with the same name are defined within the same class but with different parameter types or a different number of parameters. The appropriate method is selected during compilation based on the method signature.

    - Inheritance is not involved in this type.


## 2. Runtime Polymorphism (Dynamic Binding or Dynamic Method Dispatch)

    a. Method Overriding

    Runtime polymorphism, also known as dynamic method dispatch, is achieved through method overriding. Method overriding occurs when a subclass provides a specific implementation for a method that is already defined in its superclass. The actual method that gets called is determined at runtime based on the object's type.

    - Inheritance is involved in this type.