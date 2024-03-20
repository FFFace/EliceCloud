import java.io.*;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        // 아래 코드는 검사용으로 수정하지 말아주세요

        int oldCode = 5;
        String popularColor = "black";

        NewPlan test = new NewPlan();

        test.turnOn("on");
        test.selectTheColor(popularColor);


        System.out.println("=======시제품 테스트 결과=======");
        System.out.println("차량 코드 : " + test.code);
        System.out.println("전원 상태 : " + test.engine);
        System.out.println("바퀴 상태 : " + test.wheel);
        System.out.println("도색 상태 : " + test.body);

    }
}
