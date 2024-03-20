package workbook9;

import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calendar birthday = Calendar.getInstance();
        String[] daysOfWeek = {"일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"};

        birthday.set(Calendar.MONTH, Calendar.JULY);
        birthday.set(Calendar.DATE, 29);

        // 지시사항 2번을 참고하여 코드를 작성하세요.
        int year = scanner.nextInt();
        birthday.set(Calendar.YEAR, year);

        // 지시사항 3번을 참고하여 코드를 작성하세요.
        int dayOfWeekIndex = birthday.get(Calendar.DAY_OF_WEEK) - 1;

        // 지시사항 4번을 참고하여 코드를 작성하세요.
        System.out.println(year + "년 앨리스의 생일은 " + daysOfWeek[dayOfWeekIndex] + "입니다.");

    }
}
