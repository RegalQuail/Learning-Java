/*
An interface is a completely abstract class that contains only abstract methods.
Some specifications for interfaces:
    - Defined using the interface keyword,
    - May contain only static final variables,
    - Cannot contain a constructor because interfaces cannot be instantiated,
    - Interfaces can extend other interfaces,
    - A class can implement any number of interfaces.
*/
interface Animal {
    public void eat();
    public void makesound();
}
// A class can inherit from just one superclass, but can implement multiple interfaces
class Cat implements Animal { // Use the "implements" keyword to use an interface in a class.
    public void makesound() {
        System.out.println("Meow");
    }
    public void eat() { // when implementing an interface, all of its methods must be overriden
        System.out.println("nomnomnom");
    }
}
/*
Interfaces have the following properties:
    - An interface is implicitly abstract. You do not need to use the abstract keyword 
    while declaring an interface.
    - Each method in an interface is also implicitly abstract, so the abstract keyword is not needed.
    - Methods in an interface are implicitly public.
*/
