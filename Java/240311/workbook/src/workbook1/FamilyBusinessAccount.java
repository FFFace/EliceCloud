package workbook1;

public class FamilyBusinessAccount extends BusinessAccount {

    FamilyBusinessAccount(double balance) {
        super(balance);
    }

    public void displayBalance(){
        System.out.println("가족 비즈니스 계정 잔액: " + balance + "원");
    }
}
