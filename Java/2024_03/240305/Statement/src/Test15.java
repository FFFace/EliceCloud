import java.util.Scanner;

public class Test15 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int age = scan.nextInt();
        int price = 0;

        if (age >= 20) {
            price = 20000;
        } else if (age >= 14) {
            price = 10000;
        } else if (age >= 8) {
            price = 5000;
        }

        System.out.println("고객님, 입장료는 " + price + "원이 되겠습니다.");
    }
}
