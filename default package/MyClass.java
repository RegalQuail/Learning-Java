import samples.*; // * = imports all classes in the samples package

class MyClass {
    
    public static final double PI = 3.14; // final keyword = cannot be reassigned a value
    public static void main(String[] args) {
        
        Animal dog = new Animal();
        dog.bark();

        Vehicle v1 = new Vehicle();
        Vehicle v2 = new Vehicle();
        v1.setColor("Red");
        System.out.println(v1.getColor());
        v2.horn();

        System.out.println(Counter.COUNT);

        System.out.println(PI);
    }

}
