/*
    HashMap is used for storing data collections as key and value pairs. 
    One object is used as a key (index) to another object (the value).
    The put, remove, and get methods are used to add, delete, and access values in the HashMap.
*/
import java.util.HashMap;

// Example of a HashMap:
class MyClass {
    public static void main(String[] args) {
        // Creating a HashMap with Strings as keys and Integers as values:
        HashMap<String, Integer> points = new HashMap<>();

        points.put("Amy", 154);
        points.put("Dave", 42);
        points.put("Rob", 733);
        // Using the get() method and the corresponding key to access the HashMap elements:
        System.out.println(points.get("Dave")); // 42

        HashMap<String, String> m = new HashMap<>();

        m.put("A", "First");
        m.put("B", "Second");

        System.out.println(m.get("B")); // Second
    }
}
/*
    A HashMap cannot contain duplicate keys. 
    Adding a new item with a key that already exists overwrites the old element.
    If you try to get a value that is not present in your map, it returns the value of null.
    "null" is a special type that represents the absence of a value.
*/