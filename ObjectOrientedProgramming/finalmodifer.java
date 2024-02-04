import java.util.Scanner;

public class finalmodifer {
    /*
     * Final modifer is used to restrict user:
     * It is used with variables, methods and classes.
     * 
     * - Variable: to make variable constant. Once value is assigned to final
     * variable, it can't be changes otherwise shows compiler error.
     * - Methods: to prevent method from being overriden in the subclasses.
     * - Classes: to prevent classes from being further inherited.
     * 
     *      public class Parent {
     *          final void finalMethod() {
     *          // Implementation
     *          }
     *       }
     * 
     *      class Child extends Parent {
     *          // Error: Cannot override the final method from Parent
     *          void finalMethod() { 
     *          // Override attempt
     *      }
     *      
     * 
     */

public static class cricle {
    final float pi = 3.14f;
    float area;

    cricle(float r) {
        // pi = 50; // Error: Cannot assign a value to a final variable
        area = pi * r * r;
    }

    void dparea() {
        System.out.println("area is :" + area);
    }

    }

    public static void main(String[] args) {
        float radius;
        System.out.println("Enter the radius of circle: ");
        Scanner scan = new Scanner(System.in);
        radius = scan.nextFloat();
        cricle a = new cricle(radius);
        a.dparea();
        scan.close();
    }
}
