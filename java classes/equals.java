/* 
    Comparing objects using the equality testing operator "==",
    actually compares the references and not the object value.
    For example:
*/
class Animal {
    String name;
    Animal(String n) {
        name = n;
    }

// Right click on the class, go to Source -> Generate hashCode() and equals()...
// This will automatically create the necessary methods

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Animal other = (Animal) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }
}

class MyClass {
    public static void main(String[] args) {
        Animal a1 = new Animal("Robby"); 
        Animal a2 = new Animal("Robby");
        
        System.out.println(a1 == a2); // false
        /*
        Despite having two objects with the same name, 
        the equality testing returns false, because we have two different objects 
        (two different references or memory locations).
        */

        // Using the equals() method:
        System.out.println(a1.equals(a2)); // true
    }
}
