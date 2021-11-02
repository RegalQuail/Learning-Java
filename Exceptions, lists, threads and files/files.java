/*
    The java.io package includes a File class that allows you to work with files.
    To start, create a File object and specify the path of the file in the constructor.
*/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class files {
    public static void main(String[] args) {

        File x = new File("C:\\Programming\\GitHub\\Learning-Java\\java_test.txt"); // Using two backslashes
        // Using the exists() method to determine if a file exists:
        if(x.exists()) {
            System.out.println(x.getName() + " exists!"); // The getName() method returns the file name
        }
        else {
            System.out.println("The file does not exist");
        }
        // Here, the file exists

        /*
            Files are useful for storing and retrieving data, and there are a number of ways to read from a file.
            One of the simplest ways is to use the Scanner class from the java.util package.
            The constructor of the Scanner class can take a File object as input.
        */

        /*
            The Scanner class inherits from the Iterator, so it behaves like one.
            The Scanner object's next() method can be used to read the file's contents.
        */

        // Surrounding the code with a try/catch block as the file may not exist
        try {
            Scanner sc = new Scanner(x);
            while (sc.hasNext()) {
                System.out.println(sc.next());
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error");
        }
        // The file's contents are output word by word, because the next() method returns each word separately.
    }
}