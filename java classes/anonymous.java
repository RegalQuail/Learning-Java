class Machine {
    public void start() {
        System.out.println("Starting...");
    }
// Anonymous classes are a way to extend the existing classes on the fly.
    public static void main(String[] args) {
        // When creating the Machine object, we can change the start method on the fly.
        Machine m = new Machine() {
            @Override public void start() { // @Override makes the code easier to understand
                System.out.println("Woooooo");
            }
        };
        m.start();
    }
}
// Overriding to print "Hello"
class A {
    public void print() {
        System.out.println("A");
    }
}

class B {
    public static void main(String[] args) {
        A object = new A() {
            @Override public void print() {
                System.out.println("Hello");
            }
        };
        object.print();
    }
}