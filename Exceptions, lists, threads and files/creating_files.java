/*
    Formatter is used to create content and write it to files.
*/

import java.util.Formatter;

class create {
    // This creates an empty file at the specified path
    // If the file already exist, it will get overwritten
    public static void main(String[] args) {
        try { // Using a try/catch block as the operation can fail
            Formatter f = new Formatter("C:\\Programming\\Github\\Learning-Java\\test.txt");
            // Once the file is created, you can write content to it 
            // using the same Formatter object's format() method.
            f.format("%s %s %s", "1", "John", "Smith \r\n");
            f.format("%s %s %s", "2", "Amy", "Brown");
            f.close();
            // Important: close the file after finishing writing in it

        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
/*
    The format() method formats its parameters according to its first parameter.
    %s mean a string and gets replaced by the first parameter after the format. 
    The second %s gets replaced by the next one, and so on. 
    So, the format %s %s %s denotes three strings that are separated with spaces.
    Note: \r\n is the newline symbol in Windows.

    The code creates a file with the following content:

        1 John Smith
        2 Amy Brown
*/