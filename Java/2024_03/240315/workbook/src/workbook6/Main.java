package workbook6;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 주어진 공급품 우선 순위 배열
        int[] supplyPriorities = {3, 1, 4, 1, 5, 9, 2, 6, 5};

        // 지시사항 2번을 참고하여 코드를 작성해 보세요.
        Arrays.sort(supplyPriorities);
        // 지시사항 3번을 참고하여 코드를 작성해 보세요.
        System.out.println("정렬된 우선 순위: " + Arrays.toString(supplyPriorities));
    }
}
