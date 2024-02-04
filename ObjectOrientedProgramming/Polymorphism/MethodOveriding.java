public class MethodOveriding {
    // also making inner classes here static so that thet can directly accessed from main method
    //or else we can put this inner classes outside the MethodOveriding class, that is in other file 
    
    //Parentclass
    public static class Bank {
        int getInterest () {
            return 0;
        }
    }
    //SubClass
    public static class NIC extends Bank {
        int getInterest (){
            return 4;
        }    
    }
    //SubClass
    public static class NMB extends Bank {
        int getInterest (){
            return 5;
        }
    }

    public static void main (String []args){
        NIC n = new NIC();
        System.out.println("NIC interest rate is "+ n.getInterest());
        NMB nm = new NMB();
        System.out.println("NIC interest rate is "+ nm.getInterest());
    }
}
