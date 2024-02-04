
/*
 * Constructor are the special methos that are invoked automatically at the object creation
 * Use contructor to assign inital values to the instance variables at the time of o bject creation.
 * Constructor method has a name as of it's class, constructor has no return type.
 * Constructor can also be overloaded.
 */
public class ConstructorExample {

    /*
     * 
     * 
     * public ConstructorExample(int a, int b){
     * int add = a + b;
     * System.out.println("Added is "+ add);
     * }
     * 
     * public static void main(String[] args) {
     * ConstructorExample add = new ConstructorExample(5, 6);
     * }
     * 
     * 
     * 
     */

    public static class Reactangle {
        int length, breadth;

        public Reactangle(int l, int b) {
            length = l;
            breadth = b;
        }

        public int Area() {
            return length * breadth;
        }
    }

    public static void main(String[] args) {
        Reactangle obj = new Reactangle(4, 5);
        System.out.println("Area is : " + obj.Area());
    }

}
