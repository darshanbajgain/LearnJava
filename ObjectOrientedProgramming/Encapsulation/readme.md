The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users. To achieve this, you must:

- declare class variables/attributes as private
- provide public get and set methods to access and update the value of a private variable

In simple, we implement encapsulation in java by using access modifers (private, protected and public).

As in encapsulation, the data in a class is hidden from other classes, so it is also known as data-hiding. Encapsulation can be achieved by Declaring all the variables in the class as private and writing public methods in the class to set and get the values of variables. 

### GET & SET

Private variables can only be accessed within the same class (an outside class has no access to it). However, it is possible to access them if we provide public get and set methods.

The get method returns the variable value, and the set method sets the value.

Syntax for both is that they start with either get or set, followed by the name of the variable, with the first letter in upper case:

```java 
public class Person {
  private String name; // private = restricted access

  // Getter
  public String getName() {
    return name;
  }

  // Setter
  public void setName(String newName) {
    this.name = newName;
  }
}
```
 we use the getName() and setName() methods to access and update the variable:

```java
public class Main {
  public static void main(String[] args) {
    Person myObj = new Person();
    myObj.setName("John"); // Set the value of the name variable to "John"
    System.out.println(myObj.getName());
  }
}

// Outputs "John"
```
The Person class is a perfect example of encapsulation in action. Here, we have bundled together both data and methods related to a person into a single unit, the Person class. The data, such as the person's name, is stored as a private variable within the class. This means that the data is hidden and cannot be accessed directly from outside the class. However, we provide public getter and setter methods, getName() and setName(), respectively, to access and update the person's name.

By encapsulating both the data and methods within the Person class, we ensure that the internal state of a Person object remains encapsulated and protected from outside interference. This promotes data integrity and security, as the internal details of a Person object are hidden and can only be accessed through well-defined interfaces provided by the class. In essence, encapsulation allows us to bundle together related data and methods into a single unit, making our code more organized, maintainable, and secure.
