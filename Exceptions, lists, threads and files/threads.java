/*
    Java is a multi-threaded programming language. 
    This means that a program can make optimal use of available resources 
    by running two or more components concurrently, with each component handling a different task.
    Specific operations can be subdivided within a single application 
    into individual threads that all run in parallel.
*/

// There are two ways to create a thread:
// 1. Extend the thread class:
class Loader extends Thread { // inherit from the thread class
    @Override
    public void run() {
        System.out.println("Hello!"); // override its run method
    }
}

// 2. Implement the Runnable interface:
class loader implements Runnable {
    public void run() {
        System.out.println("Hello");
    }
}

class MyClass {
    public static void main(String[] args) {
        // 1.
        Loader obj = new Loader(); // create new object of own class
        obj.start(); // call its start() method to run the thread
        // 2.
        Thread t = new Thread(new loader()); // create new Thread object and pass the Runnable class to constructor
        t.start(); // Start the thread by calling its start() method
    }
}
/*
    It may seem that implementing the Runnable interface is a bit more complex than extending from the Thread class. 
    However, implementing the Runnable interface is the preferred way to start a Thread, 
    because it enables you to extend from another class, as well.
*/