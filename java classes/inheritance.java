class Animal {
    protected int legs; // "protected": access modifier which makes the members only visible to the subclasses
    public void eat() {
        System.out.println("The animal eats.");
    }

    public void makeSound() {
        System.out.println("Hi !");
    }
}

class Dog extends Animal { // the Dog class inherits the legs variable from the Animal class
    Dog() {
        legs = 4;
    }
}
// We can now declare a Dog object and call the "eat" method of its superclass:
class MyClass {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat(); // The animal eats.
        dog.makeSound(); // Hi !
    }
}
// Private methods are not inherited from the super class
