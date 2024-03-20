package test1;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 채점을 위한 코드이므로 수정하지 말아주세요.
        Scanner scanner = new Scanner(System.in);
        int numItems = scanner.nextInt();
        scanner.nextLine();
        String[] items = new String[numItems];
        for (int i = 0; i < numItems; i++) {
            items[i] = scanner.nextLine();
        }
        String result = findGem(items);
        System.out.println(result);
    }

    public static String findGem(String[] items) {
        // 여기에 코드를 작성해주세요.
        for(String str : items){
            if(str.equals("보석")){
                return "보석을 찾았습니다!";
            }
        }

        return "보석을 찾지 못했습니다.";
    }
}
