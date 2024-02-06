public class MyThread1 extends Thread {
    public void run (){
        for (int i=1; i<=10; i++){
            try {
                System.out.println("Thread1 starts & count: ");
                System.out.println(i);
                Thread.sleep(500);
            }
            catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
           
        }
    }
    
}