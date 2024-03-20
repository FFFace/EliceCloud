import java.util.*;

public class Test7 {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        int cnt = 1;
        boolean success = false;

        while (cnt <= 5) {
            int password = scanner.nextInt();
            if(password == 1198){
                success = true;
                break;
            }

            cnt += 1;
        }

        if (success) {
            System.out.println("탈출 성공");
        } else {
            System.out.println("탈출 실패");
        }
    }
}
