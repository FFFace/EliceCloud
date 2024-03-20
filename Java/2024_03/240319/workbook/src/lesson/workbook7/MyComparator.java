package lesson.workbook7;

import java.util.Comparator;

public class MyComparator implements Comparator<Member> {
    @Override
    public int compare(Member o1, Member o2) {
        // 이곳에 답안 코드를 작성해 주세요.
        int value = o1.getId() - o2.getId();
        if(value != 0)
            return value;

        return o2.getAge() - o1.getAge();
    }
}
