class MyClass {
    
    public static void main(String[] args) {
        
        Animal dog = new Animal();
        dog.bark();

        Vehicle v1 = new Vehicle();
        Vehicle v2 = new Vehicle();
        v1.setColor("Red");
        System.out.println(v1.getColor());
        v2.horn();

        Counter c1 = new Counter();
        Counter c2 = new Counter();
        System.out.println(Counter.COUNT);
    }

}