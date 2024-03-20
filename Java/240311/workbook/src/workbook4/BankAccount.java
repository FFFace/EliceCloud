package workbook4;

public class BankAccount {
    private String accountNumber;
    private double balance;


    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if(balance >= 0.0){
            this.balance = balance;
        }
    }

    @Override
    public String toString() {
        return "계좌번호: " + accountNumber + ", 잔액: " + balance;
    }
}
