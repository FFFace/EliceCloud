package workbook3;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int year = input.nextInt();
        int month = input.nextInt();
        int day = input.nextInt();

        int[] dateDifference = calculateDateDifference(year, month, day);

        System.out.println(String.format("차이 결과는 %d 개월 혹은 %d 일", dateDifference[0], dateDifference[1]));

    }

    public static int[] calculateDateDifference(int year, int month, int day) {

        // 지시 사항을 참고하여 코드를 작성해 보세요.
        LocalDate date = LocalDate.of(year, month, day);
        LocalDate now = LocalDate.now();


        int yearResult = now.getYear() - date.getYear();
        int monthResult = now.getMonthValue() - date.getMonthValue();
        int dayResult = now.getDayOfMonth() - date.getDayOfMonth();

        int[] results = new int[2];
        results[0] = yearResult * 12 + monthResult;
        results[1] = results[0] * 30 + dayResult;

        return results;
    }
}

