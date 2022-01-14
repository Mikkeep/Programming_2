import java.util.Scanner;

public class PankkitiliMain {
    public static void main(String[] args) {
        Pankkitili bank = new Pankkitili("", "", 0);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter account owners name please: ");
        bank.setOwner(input.nextLine());
        System.out.println("Enter account number please: ");
        bank.setAccNum(input.nextLine());
        System.out.println("Enter account balance please: ");
        bank.setBalance(input.nextDouble());
        bank.checkInfo();

        while (true) {
            System.out.println("Choose an option to either withdraw or deposit money from your account");
            System.out.println("1. Deposit money");
            System.out.println("2. Withdraw money");
            System.out.println("3. Check account information");
            System.out.println("4. Quit");
            int choice;
            try {
            choice = input.nextInt();
                switch (choice) {
                    case 1 -> {
                        System.out.println("Enter the deposit amount please: ");
                        bank.setDeposit(input.nextDouble());
                        bank.checkInfo();
                    }
                    case 2 -> {
                        System.out.println("Enter the amount to withdraw please: ");
                        bank.withdraw(input.nextDouble());
                        bank.checkInfo();
                    }
                    case 3 -> bank.checkInfo();
                    case 4 -> {
                        System.out.println("Quitting the program, thank you for visiting!");
                        System.exit(0);
                    }
                    default -> System.out.println("Not a valid choice, try again please");
                }
            }
            catch (java.util.InputMismatchException error) {
                System.out.println("Not a valid input, do not break me and only input numbers!");
            }
        }
    }
}
