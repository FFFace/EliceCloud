package test2;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        // main 메소드의 내용은 실행 / 채점을 위한 코드이므로 수정하지 말아주세요.
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        String result = solution(rows);
        System.out.println(result);
    }

    public static String solution(int rows) {
        String result = "";

        // 여기에 코드를 작성해주세요.
        if(rows % 2 == 0){
            return "입력값은 홀수여야 합니다.";
        }

        int mid = rows/2;
        for(int i=0; i<=mid; i++){
            for(int j=i; j<mid; j++){
                result += " ";
            }

            for(int j=0; j<i*2+1; j++){
                result += "*";
            }
            result += "\n";
        }

        for(int i=mid; i>0; i--){
            for(int j=mid; j>=i; j--){
                result += " ";
            }

            for(int j=i*2-1; j>0; j--){
                result += "*";
            }
            result += "\n";
        }

        return result;
    }
}