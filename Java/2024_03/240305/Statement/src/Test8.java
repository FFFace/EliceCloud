import java.util.Scanner;

public class Test8 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt(); //출력할 구구단의 숫자를 입력할 변수

        for(int i=1; i<10; i++){
            System.out.println(n*i);
        }
    }
}
