package test5;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String args[]) {
        // main 메소드의 내용은 실행 / 채점을 위한 코드이므로 수정하지 말아주세요.
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        int[] numbers = new int[T];
        for (int i = 0; i < T; i++) {
            numbers[i] = scanner.nextInt();
        }
        ArrayList<Integer> result = solution(numbers);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static ArrayList<Integer> solution(int[] numbers) {
        // 여기에 코드를 작성해주세요.
        ArrayList<Integer> primeSelected = new ArrayList<>();
        ArrayList<Integer> finalPrimeSelected = new ArrayList<>();
        for(int i : numbers){
            boolean isPrime = true;
            for(int j=2; j<i; j++){
                if(i%j == 0){
                    isPrime = false;
                    break;
                }
            }

            if(isPrime){
                primeSelected.add(i);
            }
        }

        for(int i : primeSelected){
            int digit = Integer.toString(i).length();
            int num = i;
            int reverse = 0;
            for(int j = 0; j<digit; j++){
                int lastNum = num % 10;
                reverse = reverse * 10 + lastNum;
                num /= 10;
            }

            boolean isPrime = true;
            for(int j=2; j<reverse; j++){
                if(reverse%j == 0){
                    isPrime = false;
                    break;
                }
            }

            if(isPrime){
                finalPrimeSelected.add(i);
            }
        }

        return finalPrimeSelected;
    }
}