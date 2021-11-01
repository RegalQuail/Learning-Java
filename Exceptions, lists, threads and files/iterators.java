/*
  An Iterator is an object that enables to cycle through a collection,
  obtain or remove elements.
  Before you can access a collection through an iterator,
  you must obtain one. Each of the collection classes provides an iterator()
  method that returns an iterator to the start of the collection.
  By using this iterator object, you can access each element in the collection,
  one element at a time.

  The Iterator class provides the following methods:
    - hasNext(): Returns true if there is at least one more element;
    otherwise, it returns false.
    - next(): Returns the next object and advances the iterator.
    - remove(): Removes the last object that was returned by next from the collection.
*/
// The Iterator class must be imported from the java.util package:
import java.util.LinkedList;
import java.util.Iterator;

class iterators {
    public static void main(String[] args) {

        LinkedList<String> animals = new LinkedList<>();
        animals.add("Fox");
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Rabbit");

        Iterator<String> it = animals.iterator();
        String valueOne = it.next();
        System.out.println(valueOne); // Fox

        // Typically, iterators are used in loops. At each iteration,
        // the corresponding list element can be accessed. 
        while(it.hasNext()) {
            String value = it.next();
            System.out.println(value);
            /*
                Fox
                Cat
                Dog
                Rabbit
            */
        }

    }
}
/*
  it.next() returns the first element in the list
  and then moves the iterator on to the next element.
  Each time you call it.next(), the iterator moves to the next element of the list.
*/
