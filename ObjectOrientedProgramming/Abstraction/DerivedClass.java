public class DerivedClass extends BaseClass {
    void run (){
        System.out.println("Run is abstract method, and it implelmented at Derived Class");
    }

    public static void main(String[] args) {
        /// the below line tries to instantiate the abstract Baseclass object 
        ///BaseClass obj = new BaseClass(); (this can't be done when using abstraction)
        DerivedClass dobj = new DerivedClass();

        dobj.run();
        dobj.fun();
        
        System.out.println("after upcasting");
        //but we can have upcasting , reference type like:
        BaseClass obj = new DerivedClass();
        obj.run();
        obj.fun();
    }
}
