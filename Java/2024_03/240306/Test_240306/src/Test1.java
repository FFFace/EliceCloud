import java.io.*;
import java.util.Scanner;

public class Test1 {

    // [참고용] 기존 설계도
// class OldPlan {
//     public String wheel;
//     public String body;
//     public int code;
// }

    public static void main(String[] args) {
        NewPlan test1 = new NewPlan(1);
        NewPlan test2 = new NewPlan(2);
        NewPlan test3 = new NewPlan(3);

        System.out.println(test1.getCode());
        System.out.println(test2.getCode());
        System.out.println(test3.getCode());
    }
}