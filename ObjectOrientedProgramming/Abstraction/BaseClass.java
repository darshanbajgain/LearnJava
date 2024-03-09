public abstract class BaseClass {

    //abstract class contains constructor.
    BaseClass (){
        System.out.println("Abstract Base class constructor is called.");
    }
    
    abstract void run ();

    void fun () {
        System.out.println("fun is not abstract method, but non abstract method can be declared in abstract class");
    }


}