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
        this.owner = newOwner;
    }

    public void setAccNum(String newNum) {
        this.accNum = newNum.toUpperCase();
    }

    public void setBalance(double newBal) {
        this.balance = newBal;
    }

    public void setDeposit(double depositAmount) {
        this.balance = this.balance + depositAmount;
    }

    public void withdraw(double withdrawAmount) {
        this.balance = this.balance - withdrawAmount;
    }

    public String getUser() {
        return this.owner;
    }

    public String getNum() {
        return this.accNum;
    }

    public double getBal() {
        return this.balance;
    }

}
