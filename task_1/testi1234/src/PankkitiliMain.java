import java.util.Scanner;

public class PankkitiliMain {
    public static void main(String[] args) {
        Pankkitili bank = new Pankkitili("", "", 0);
        Scanner input = new Scanner(System.in);
        double tempBal;
        System.out.println("Enter account owners name please: ");
        bank.setOwner(input.nextLine());
        System.out.println("Enter account number please: ");
        bank.setAccNum(input.nextLine());
        System.out.println("Enter account balance please: ");
        tempBal = input.nextDouble();
        if (tempBal < 0)
            System.out.println("Balance cannot be a negative number\nBalance defaults to 0 until correct deposit\n");
        else bank.setBalance(tempBal);
        System.out.println("Account is owned by: " + bank.getUser());
        System.out.println("Account number is : " + bank.getNum());
        System.out.println("Account balance is : " + bank.getBal() + " €");

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
                        //tempBal variable reuse to collect input
                        tempBal = input.nextDouble();
                        if (tempBal < 0)
                            System.out.println("Deposit cannot be a negative");
                        else bank.setDeposit(tempBal);
                        System.out.println("Account balance is : " + bank.getBal() + " €");
                    }
                    case 2 -> {
                        System.out.println("Enter the amount to withdraw please: ");
                        tempBal = input.nextDouble();
                        if (tempBal > bank.getBal())
                            System.out.println("Withdraw cannot be larger than the balance of the account");
                        else if (tempBal < 0) {
                            System.out.println("Withdraw cannot be negative");
                        }
                        else bank.withdraw(tempBal);
                        System.out.println("Account balance is : " + bank.getBal() + " €");
                    }
                    case 3 -> {
                        System.out.println("Account is owned by: " + bank.getUser());
                        System.out.println("Account number is : " + bank.getNum());
                        System.out.println("Account balance is : " + bank.getBal() + " €");
                    }
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
