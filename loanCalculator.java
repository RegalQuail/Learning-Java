import java.util.Scanner;

public class loanCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();

        for (int months = 0; months < 3; months++) {
            int payment = amount / 10;
            amount -= payment;
        }
        System.out.println(amount);

        scanner.close();
    }
}
