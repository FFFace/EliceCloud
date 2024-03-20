import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isAdult = scanner.nextBoolean();

        double monthlyIncome = scanner.nextDouble();

        int creditScore = scanner.nextInt();

        boolean isApproved = isAdult && (monthlyIncome >= 170) && (creditScore >= 650);

        if (!isAdult) {
            System.out.println("대출을 받으려면 성인이여야 합니다.");
        } else if(!(monthlyIncome >= 170)){
            System.out.println("월 수입이 대출 승인 기준에 미치지 못합니다.");
        } else if(!(creditScore >= 650)) {
            System.out.println("신용 점수가 대출 승인 기준에 미치지 못합니다.");
        }

        if (isApproved) {
            System.out.println("축하합니다! 대출이 승인되었습니다");
        }
    }
}
