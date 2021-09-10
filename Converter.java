import java.util.Scanner;

class Converter {
    public static toBinary() {
        String binary = "";
        while (num > 0) {
            binary = (num % 2) + binary;
            num /= 2;
        }
    }
    public static class Program {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            System.out.println(Converter.toBinary(x));
        }
    }
}
