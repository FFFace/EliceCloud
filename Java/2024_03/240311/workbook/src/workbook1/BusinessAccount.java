package workbook1;

public class BusinessAccount {
    protected double balance;

    BusinessAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }
}
