/*
 * 
 * Need Java Inheritance?
 * Code Reusability: The code written in the Superclass is common to all subclasses. 
 * Child classes can directly use the parent class code.
 * 
 * Method Overriding: Method Overriding is achievable only through Inheritance.
 * It is one of the ways by which Java achieves Run Time Polymorphism.
 * 
 * Abstraction: The concept of abstract where we do not have to provide all details is achieved through inheritance.
 * Abstraction only shows the functionality to the user.
 * 
 */
public class InheritanceExample {
 public static class Animal{
    void walk(){
        System.out.println("It can walk");
    }
    void strength (){}
 }

 public static class Dog extends Animal {
    void bark(){
        System.out.println("It can bark");
    }
 }

 public static class GermanShephard extends Dog {
    void color(){
        System.out.println("It is brown");
    }
    //@Override
    void strength (){
        System.out.println("German Shephard is Very Strong");
    }
 }

 public static void main(String[] args) {
    GermanShephard feature = new GermanShephard();
    feature.walk();
    feature.bark();
    feature.color();
    feature.strength();
    // this program is also example of multilevel inheritance
 }
    
}