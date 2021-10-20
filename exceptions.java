// An exception is a problem that occurs during program execution,
// and can cause abnormal termination
public class exceptions { 
    public static void main(String[] args) {
// Exception handling is a powerful mechanism that handles runtime errors to maintain normal application flow.
/*
    Exceptions can be caught using a combination of the try and catch keywords.
    A try/catch block is placed around the code that might generate an exception.
    For example:
*/
        try { // This code should crash the program, as a[5] does not exist. 
            int a[] = new int[2];
            System.out.println(a[5]);
        } catch (Exception e) { // Exception handling when trying to access an array index that doesn't exist
            System.out.println("An error occured");
        }
        // Notice the (Exception e) statement in the catch block - it is used to catch all possible Exceptions.
        // Another example:

        int x = 12;
        int y = 0;

        try {
            int z = x / y; // A number can't be divided by 0
            System.out.println(z);
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}