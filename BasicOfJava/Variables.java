
public class Variables {

    // (1.)
    // This is an instance variable.
    // Instance variables are declared within a class but outside of any method, constructor, or block.
    // Instance variables are initialized with default values if not explicitly set.
    int y;

    // (2.)
    // This is static varibale declared with static keyword
    // Memory allocation for static variables happens only once when the class is loaded in the memory.
    static int a = 20; 

    void display(){
    // (3.)
    // This is local variable inside the body of method
    // Local variables are declared within a method, constructor, or block of code and are only accessible within that specific scope.
    // Local variables must be initialized before they are used.
        int b = 50; 
        System.out.println("local variable, b is "+ b);
    }


    public static void main (String []args){

        Variables obj = new Variables();

        //acessing the default value of instance variable
        System.out.println("Default value of instance variable is: "+ obj.y);
        //assign value to instance variable and accessing it
        obj.y = 45;
        System.out.println("After assigning, new Instance variable is :"+ obj.y);

        //accessing static variable
        System.out.println("Static variable is :"+ Variables.a); // accessing static variable in static way 
        //i.e. Whenever we need to acess any static variable in main method, we use className to acess it.

        //calling the display method and acessing the local variable
        obj.display();
    }
}