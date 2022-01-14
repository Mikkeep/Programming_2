public class Pankkitili {

    private String owner;
    private String accNum;
    private double balance;

    public Pankkitili(String newOwner, String newNum, double newBal) {
        this.owner = newOwner;
        this.accNum = newNum;
        this.balance = newBal;
    }

    public void setOwner(String newOwner) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter account owners name please: ");
//        this.owner = input.nextLine();
        this.owner = newOwner;
    }

    public void setAccNum(String newNum) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter account number please: ");
        this.accNum = newNum.toUpperCase();
    }

    public void setBalance(double newBal) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter account balance please: ");
        //Temporary variable for checking if the deposit is illegal
        double tempBal;
        tempBal = newBal;
        if (tempBal < 0)
            System.out.println("Balance cannot be a negative number");
        else this.balance = tempBal;
    }

    public void setDeposit(double depositAmount) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the deposit amount please: ");
        //Temporary variable for checking if the deposit is illegal
//        double tempBal;
//        tempBal = depositAmount;
        if (depositAmount < 0)
            System.out.println("Deposit cannot be a negative");
        else this.balance = this.balance + depositAmount;
    }

    public void withdraw(double withdrawAmount) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the amount to withdraw please: ");
        //Temporary variable for checking if the deposit is illegal
//        double withdraw;
//        withdraw = withdrawAmount;
        if (withdrawAmount > this.balance)
            System.out.println("Withdraw cannot be larger than the balance of the account");
        else if (withdrawAmount < 0) {
            System.out.println("Withdraw cannot be negative");
        }
        else this.balance = this.balance - withdrawAmount;
    }

    public void checkUser() {
        System.out.println("Account is owned by: " + owner);
    }

    public void checkBal() {
        System.out.println("Account balance is : " + balance + " €");
    }

    public void checkInfo() {
        System.out.println("Account is owned by: " + owner);
        System.out.println("Account number is : " + accNum);
        System.out.println("Account balance is : " + balance + " €");
    }

}
