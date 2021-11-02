/*
    The java.io package includes a File class that allows you to work with files.
    To start, create a File object and specify the path of the file in the constructor.
*/
import java.io.File;

class files {
    public static void main(String[] args) {

        File x = new File("C:\\Programming\\GitHub\\Learning-Java\\java_test.txt");
        // Using the exists() method to determine if a file exists:
        if(x.exists()) {
            System.out.println(x.getName() + " exists!");
        }
        else {
            System.out.println("The file does not exist");
        }
        // Here, the file exists
    }
}