import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        
        // Access the array's variables with their index (starting from 0)
        String[] myNames = {"A", "B", "C", "D"};
        System.out.println(myNames[1]); // B

        // Get the length of an array
        int[] intArr = new int[5];
        System.out.println(intArr.length); // 5

        // Use a for-loop to calculate the sum of an array of integers
        int[] myArr = {6, 42, 3, 7};
        int sum = 0;
        for (int x = 0; x < myArr.length; x++) {
            sum += myArr[x];
        }
        System.out.println(sum); // 58
        
        // Enhanced for-loop or "for each" loop
        int[] primes = {2, 3, 5, 7};
        for (int t: primes) {
            System.out.println(t); // 2, 3, 5, 7
        }
        
        // Multidimensional arrays 
        // Where the first bracket is the index of the array, the second of the variable
        int[][] sample = {{1, 2, 3}, {4, 5, 6}};
        int x = sample[1][0];
        System.out.println(x); // 4

        String arrayNames[][] = {{"Hey", "John", "Bye"}, {"John", "Johnson", "Hello"}};
        System.out.println(arrayNames[1][1]); // Johnson
        
        int arrayNumbers[][] = {{3, 5, 8}, {7, 54, 1, 12, 4}};
        System.out.println(arrayNumbers[1][3]); // 12
        
        int arr[] = new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = i;
        }
        int res = arr[0] + arr[2];
        System.out.println(res); // 0 + 2 = 2
        
        // What will be the result ?
        int result = 0;
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                result += 10;
            } else {
                result += i;
            }
        }
        System.out.println(result);

        /* 
        
        Answer :

        result = 0,
        i = 1, 2, 3, 4

        Operations :
        -> result += i
        -> if i == 3, result += 10

        So :

            when i = 0, result += 0 -> 0 + 0 = 0, result == 0
            when i = 1, result += 1 -> 0 + 1 = 1, result == 1
            when i = 2, result += 2 -> 1 + 2 = 3, result == 3
            when i = 3, result += 10 -> 3 + 10 = 13, result == 13
            when i = 4, result += 4 -> 4 + 13 = 17, result == 17
        
        Output : 17

        */
        
        // Reverse a String
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        char[] array = text.toCharArray();

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
        // Closing scanner
        scanner.close();
    }
}
