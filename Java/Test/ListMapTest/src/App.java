import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        List<Integer> s1 = Arrays.asList(99, 98, 97, 96, 95);
        List<Integer> s2 = Arrays.asList(94, 93, 92, 91, 90);
        List<Integer> s3 = Arrays.asList(89, 88, 87, 86, 85);

        Map<String, List<Integer>> student = new HashMap<>();
        student.put("홍길동", s1);
        student.put("김사랑", s2);
        student.put("아무개", s3);

        Scanner scan = new Scanner(System.in);
        System.out.print("조회할 이름 입력 :");
        String input = scan.next();

        int total = 0;
        for(int s : student.get(input)){
            total += s;
        }

        System.out.printf("총점 : %d, 평균 : %d\n", total, total/5);
    }
}
