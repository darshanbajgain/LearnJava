# Multithreading in Java
### Definition: Multithreading refers to concurrent execution of multiple parts of a program.
### Benefits: Improves CPU utilization and program efficiency by running tasks concurrently.
### Methods of Creating Threads

**Implementing Runnable Interface**
```
class MyThread implements Runnable {
    public void run() {
        // Task implementation
    }
}
// Inside Main method:
MyThread t1 = new MyThread();
Thread thr = new Thread(t1);
thr.start();
```



- Usage: Create a class implementing Runnable and define the task in the run() method.
- Code Structure: Create a Thread object passing an instance of the Runnable class in the constructor, then start the thread.
- Advantages: Separates concerns, promotes code reusability, and allows flexibility.

**Extending Thread Class**
```
class MyThreadExtend extends Thread {
    public void run() {
        // Task implementation
    }
}

// Inside Main method:
MyThreadExtend t2 = new MyThreadExtend();
t2.start();

```

- Usage: Extend the Thread class and override the run() method to define the task directly within the subclass.
- Code Structure: Create an instance of the subclass and start the thread directly.
- Advantages: Simplicity in usage but might limit flexibility due to class inheritance.


**Differences and Recommendations**

- *Runnable vs. Extend Thread:* While extending Thread may seem simpler initially, implementing Runnable separates concerns and promotes better design, code reusability, and flexibility.
- *Recommendation:* Favor implementing Runnable for better code organization and maintainability in larger or complex applications.

Here are some key points and differences between the two approaches:

### Runnable Interface
- **Implements Runnable:** The class `MyThread` implements the `Runnable` interface, providing the `run()` method.
- **Separation of Concerns:** By implementing `Runnable`, you separate the task (defined in `run()`) from the threading mechanism. This promotes better design and code reusability.
- **Thread Construction:** An instance of `MyThread` is passed as a parameter to a `Thread` object: `Thread thr = new Thread(t1);`. This associates the `run()` method of `MyThread` with the newly created thread.

### Extending Thread Class
- **Extends Thread Class:** The class `MyThreadExtend` extends the `Thread` class, overriding its `run()` method directly.
- **Tightly Coupled:** Extending `Thread` directly may lead to a tighter coupling of the task with the threading mechanism. It might limit flexibility in the future, as the class is already a thread and cannot extend any other class.
- **Thread Object Creation:** You directly create an instance of `MyThreadExtend` and start it: `MyThreadExtend t2 = new MyThreadExtend(); t2.start();`.

### Differences Highlighted
- **Interface vs. Inheritance:** The Runnable approach uses interface implementation, while the Thread extension uses inheritance.
- **Flexibility:** Implementing Runnable provides more flexibility as the class isn’t bound to the Thread class's limitations.
- **Reusability:** Implementing Runnable allows the class to be used in other contexts or by other classes easily, while extending Thread might limit its reuse due to inheritance restrictions.

