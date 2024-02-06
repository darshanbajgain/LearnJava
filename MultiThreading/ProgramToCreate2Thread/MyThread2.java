public class MyThread2 implements Runnable {
    public void run (){
        for(int i=11; i<=20; i++){
            try {
                System.out.println("Thread2 starts & counts: ");
                System.out.println(i);
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
