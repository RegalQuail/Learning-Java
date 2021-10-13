// Polymorphism = having many forms
// it occurs when there is a hierarchy of classes related to each other through inheritance
// Polymorphism is one method, with different implementation
class Animal {
    public void makeSound() {
        System.out.println("Grr...");
    }
    // as both Cat and Dog are Animal objects, we can do the following in main:
    public static void main(String[] args) {
        Animal a = new Cat();
        Animal b = new Dog();
// Two reference variables of type Animal have been created, and pointed to the Cat and Dog objects.
// Now, the makeSound() methods can be called.    
        a.makeSound(); // the reference variable "a" has a Dog object, the makeSound() method of the Dog class can be called.
        b.makeSound(); // the same applies for variable "b"
    }
}
// inherits from the Animal class + has its own implementation of the makeSound() method
class Cat extends Animal { 
    @Override
    public void makeSound() {
        System.out.println("Meow...");
    }
}
// inherits from the Animal class + has its own implementation of the makeSound() method
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof");
    }
}
/*
    This demonstrates that you can use the Animal variable 
    without actually knowing that it contains an object of the subclass.
    This is very useful when you have multiple subclasses of the superclass.
*/