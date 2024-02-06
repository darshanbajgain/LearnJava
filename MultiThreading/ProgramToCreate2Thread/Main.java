public class Main {
    public static void main(String[] args) {
        //creating instance of Thread1
        MyThread1 t1 = new MyThread1();
        //directly using t1 to start thread as it is done by Extend class
        t1.start(); // starts thread1
        //creating instance of thread2
        MyThread2 t2 = new MyThread2();
        //passing t2 as paramenter to thread obj as it is done by Runnable interface
        Thread obj =  new Thread(t2);
        obj.start(); //starts thread2 
    }
}
