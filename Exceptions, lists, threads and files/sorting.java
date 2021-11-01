/*
    For the manipulation of data in different collection types, 
    the Java API provides a Collections class, which is included in the java.util package.
    One of the most popular Collections class methods is sort(), 
    which sorts the elements of your collection type.
*/

import java.util.ArrayList;
import java.util.Collections;

class MyClass {
    public static void main(String[] args) {
        // Creating list of animal names:
        ArrayList<String> animals = new ArrayList<>();

        animals.add("Tiger");
        animals.add("Cat");
        animals.add("Snake");
        animals.add("Dog");

        Collections.sort(animals); // Sorts alphabetically

        System.out.println(animals); // [Cat, Dog, Snake, Tiger]

        // The sort() method can also be used on lists of integers:

        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(3);
        nums.add(36);
        nums.add(73);
        nums.add(40);
        nums.add(1);

        Collections.sort(nums); // sorts in ascending order

        System.out.println(nums); // [1, 3, 36, 40, 73]
    }
}
/*
    Other useful methods in the Collections class:
        - max(Collection c): Returns the maximum element in c as determined by natural ordering.
        - min(Collection c): Returns the minimum element in c as determined by natural ordering.
        - reverse(List list): Reverses the sequence in list.
        - shuffle(List list): Shuffles (i.e., randomizes) the elements in list.
*/