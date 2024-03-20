package lesson.workbook6;

import java.time.Period;
import java.util.ListIterator;

class Solution {

    public static void solution(ListIterator<Integer> iterator) {
        // 이곳에 정답 코드를 작성해 주세요.
        int now = 0;
        int count = 0;

        while(iterator.hasNext()){
            int next = iterator.next();
            count = now < next ? count+1 : count;
            now = next;
        }

        System.out.println(count);
    }

    private Solution() {}
}
