public class DynamicMethodDispatch {

    /* Run Time Ploymorphism
     * Dynamic Dispatch method is a process in which a call to overidden fucntion is resolved
     * at runtime rather than compile time
     * 
     * In Dynamic Dispatch method overidden method in subclass is called through reference variable of superclass
     * Upcasting is performed.
     * 
     * Note: I am using inner classes here and demonstrating all the program example in one file, so I am using 
     * static keyword for every inner classes inside DynamicMethodDispatch classs so that i can directly access
     * from main method of DynamicMethodDispatch.Using static inner classes allows us to create instances without
     * requiring an instance of the outer class. This facilitates direct access from the static main method without
     * the need for object instantiation of the outer class.
     */


     //Parentclass
     public static class Bank {
        int getInterest () {
            return 0;
        }
    }
    //SubClass
    public static class NIC extends Bank {
        //@Override
        int getInterest (){
            return 4;
        }    
    }
    //SubClass
    public static class NMB extends Bank {
        //@Override
        int getInterest (){
            return 5;
        }
    }

    public static void main ( String []args){
        //In this main method, objects of NMB and NIC are created and assigned to 
        //reference variables of the type Bank where Bank is superclass & NIC/NMB are subclass
        Bank obj1 = new NMB(); //upcasting
        Bank obj2 = new NIC(); //upcasting
        System.out.println("Rate of NMB: "+obj1.getInterest()+", Rate of NIC: "+ obj2.getInterest());
    }

}