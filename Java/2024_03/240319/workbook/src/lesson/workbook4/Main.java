package lesson.workbook4;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // 이곳에 답안 코드를 작성해 주세요.
        Set<String> works = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        int cmdNum = scanner.nextInt();
        for(int i=0; i<cmdNum; i++){
            String work = scanner.next();
            works.add(work);
        }

        System.out.println(works.size());
    }
}
