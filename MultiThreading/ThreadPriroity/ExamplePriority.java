
public class ExamplePriority {
    public static class Thread1 extends Thread {

        public void run() {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
            }
        }
    }

    public static class Thread2 extends Thread {
        public void run() {
            for (int i = 11; i <= 20; i++) {
                System.out.println(i);
            }
        }
    }

    public static class Thread3 extends Thread {
        public void run() {
            for (int i = 21; i <= 30; i++) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        Thread3 t3 = new Thread3();
        
        //now assining priorities
        t1.setPriority(10);
        t2.setPriority(2);
        t3.setPriority(5);
        t1.start();
        t2.start();
        t3.start();
    }
}
