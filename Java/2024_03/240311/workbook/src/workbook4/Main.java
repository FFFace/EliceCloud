package workbook4;

public class Main {
    public static void main(String[] args) {

        BankAccount myAccount = new BankAccount();

        // 계좌번호와 초기 잔액을 설정
        myAccount.setAccountNumber("12345678");
        myAccount.setBalance(1000.00);

        // 계좌 정보 출력
        System.out.println(myAccount);

    }
}