// Linked List is a part of the Collection Framework present in java.util package.
/*
    This class is an implementation of the LinkedList data structure 
    which is a linear data structure where the elements are not stored in contiguous locations 
    and every element is a separate object with a data part and address part. 
    The elements are linked using pointers and addresses. Each element is known as a node. 
    Due to the dynamicity and ease of insertions and deletions, they are preferred over the arrays. 
    It also has few disadvantages like the nodes cannot be accessed directly, 
    instead we need to start from the head and follow through the link to reach to a node we wish to access.
*/
// How to create and use a linked list:
import java.util.*;

class linked_lists {
    public static void main(String[] args) {
    // Creating an object of the class LinkedList:
    LinkedList<String> ll = new LinkedList<>();
    
    ll.add("A"); 
    ll.add("B");
    ll.addLast("C");
    ll.addFirst("D");
    ll.add(2, "E"); 

    System.out.println(ll); // [D, A, E, B, C]

    ll.remove("B"); 
    ll.remove(3); 
    ll.removeFirst();
    ll.removeLast();

    System.out.println(ll); // [A]
    }

    public class add {
        // Java program to add elements to a LinkedList:
        public void main(String[] args) {
            LinkedList<String> ll = new LinkedList<>();
            // Adding elements to the linked list using the add() method:
            ll.add("I");
            ll.add("Java");
            // Adding elements using the add(int index, Object) method, 
            // adding an element at a specific index
            ll.add(1, "Love");

            System.out.println(ll); // [I, Love, Java]
        }
    }
    /*
        Changing Elements:
        After adding the elements, if we wish to change the element, 
        it can be done using the set() method. Since a LinkedList is indexed, 
        the element which we wish to change is referenced by the index of the element. 
        Therefore, this method takes an index and the updated element 
        which needs to be inserted at that index.
    */
    public class change {
        // Java program to change elements in a LinkedList:
        public void main(String[] args) {
            LinkedList<String> ll = new LinkedList<>();

            ll.add("I");
            ll.add("Like");
            ll.add("Java");

            System.out.println("Initial LinkedList: " + ll); // [I, Like, Java]

            ll.set(1, "Love"); // Index start at 0

            System.out.println("Updated LinkedList: " + ll); // [I, Love, Java]
        }
    }
    /*
        Removing Elements:
        In order to remove an element from a LinkedList, we can use the remove() method. 
        This method is overloaded to perform multiple operations based on different parameters. 
        They are:
            - remove(Object): to remove an object, if their ar multiple occurences, the first one is removed
            - remove(int index): A LinkedList is indexed, so by taking an int value, the element at the 
            specific index is removed. All the elements of the LinkedList are then moved to the left,
            and the indices are updated.
    */
    public class remove {
        // Java program to remove elements in a LinkedList:
        public void main(String[] args) {
            LinkedList<String> ll = new LinkedList<>();

            ll.add("I");
            ll.add("Love");
            ll.add("Java");

            System.out.println("Initial LinkedList: " + ll); // Initial LinkedList: [I, Love, Java]

            ll.remove(0);

            System.out.println("After the Index Removal: " + ll); // After the Index Removal: [Love, Java]

            ll.remove("Love" + ll);

            System.out.println("After the Object Removal: " + ll); // After the Object Removal: [Java]
        }
    }
    /*
        Iterating the LinkedList:
        There are multiple ways to iterate through the LinkedList. 
        The most famous ways are by using the basic for loop in combination with a get() method 
        to get the element at a specific index and the advanced for loop.
    */
    public class iterating {
        // Java program to iterate the elements of a LinkedList:
        public void main(String[] args) {
            LinkedList<String> ll = new LinkedList<>();

            ll.add("I");
            ll.add("Java");
            ll.add(1, "Love");

            // Using the get() method and the for-loop:
            for (int i = 0; i < ll.size(); i++) {
                System.out.println(ll.get(i) + " ");
            }

            System.out.println(); // I Love Java

            for (String str: ll) {
                System.out.println(str + " "); // I Love Java
            }
        }
    }
}