import java.util.ScannerL;

public class atm {
    
    public static void main(String[] args) {

        int balance = 10000, withdraw, deposit;
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("Automated Teller Machine");
            System.out.println("Choose 1 to Withdraw");
            System.out.println("Choose 2 to Deposit");
            System.out.println("Choose 3 to check your Balance");
            System.out.println("Choose 4 to Exit");
            System.out.println("Choose the operation you wish to perform: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1: System.out.println("Enter the amount of money you want to withdraw: ");
                withdraw = sc.nextInt();

                if (balance >= withdraw) {

                    balance -= withdraw;
                    System.out.println("Please collect your money");

                }

                else {

                    System.out.println("Insufficient balance");

                }

                System.out.println("");
                break;

                case 2: System.out.println("Enter the amount of money to be deposited: ");

                deposit = sc.nextInt();
                balance += deposit;

                System.out.println("Your money has been succesfully deposited");
                System.out.println("");

                break;

                case 3: System.out.println("Balance: " + balance);
                
                System.out.println("");
                break;

                case 4: System.exit(0);

            }

        }

    }

}
