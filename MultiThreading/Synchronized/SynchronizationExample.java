// Using synchronized block to prevent potential deadlock

// Main class for the synchronization example
public class SynchronizationExample {
    // Shared resources
    final static String resource1 = "ASCOL";
    final static String resource2 = "CSIT";

    public static void main(String[] args) {

        // Thread 1 definition
        Thread t1 = new Thread() {
            public void run() {
                // Synchronize on resource1 to avoid potential deadlock
                synchronized (resource1) {
                    System.out.println("Thread 1 locked resource 1");
                    try {
                        // Simulate some work being done
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.out.println(e.getMessage());
                    }
                }

                // Synchronize on resource2
                synchronized (resource2) {
                    System.out.println("Thread 1 locked resource 2");
                    try {
                        // Simulate some work being done
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.out.println(e.getMessage());
                    }
                }
            } // End of run
        };

        // Thread 2 definition
        Thread t2 = new Thread() {
            public void run() {
                // Synchronize on resource2 to avoid potential deadlock
                synchronized (resource2) {
                    System.out.println("Thread 2 locked resource 2");
                    try {
                        // Simulate some work being done
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.out.println(e.getMessage());
                    }
                }

                // Synchronize on resource1
                synchronized (resource1) {
                    System.out.println("Thread 2 locked resource 1");
                    try {
                        // Add your code for resource1 here
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
            } // End of run
        };

        // Start both threads
        t1.start();
        t2.start();
    }
}
