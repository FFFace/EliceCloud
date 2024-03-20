import java.util.Scanner;

public class Test14 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("메뉴 번호를 입력해 주세요.");
        int n = scan.nextInt();

        switch (n) {
            case 1:
                System.out.println("아메리카노를 선택하셨습니다.");
                break;

            case 2:
                System.out.println("카페라떼를 선택하셨습니다.");
                break;

            case 3:
                System.out.println("카푸치노를 선택하셨습니다.");
                break;

            case 4:
                System.out.println("프라푸치노를 선택하셨습니다.");
                break;

            case 5:
                System.out.println("다른 번호를 입력해 주세요.");
                break;
        }

        System.out.println("이용해주셔서 감사합니다.");
    }
}
