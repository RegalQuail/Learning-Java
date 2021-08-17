class oop {
    // Simply prints "Hello World !"
    static void sayHello() {
        System.out.println("Hello World !");
    }

    // Returns an integer value of 5
    static int returnFive() {
        return 5;
    }
    // Has a parameter
    static void sayHelloTo(String name) {
        System.out.println("Hello " + name);
    }
    // Evaluates the greater integer
    static int max(int a, int b) {
        if (a > b) {
            return a;
        }
        else {
            return b;
        }
    }
    // Has a parameter
    static void whoIsDumbass(String name) {
        System.out.println("That person is a dumbass: " + name);
    }

    public static void main(String[] args) {
        returnFive();
        sayHello();
        sayHelloTo("Jonah");
        int result = max(7, 42);
        System.out.println(result);
        whoIsDumbass("Thomas");
    }
    
}
