package workbook8;

import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        String complexLog = "UserActivity;user1;login, SystemAlert;Memory;Critical, UserActivity;user2;logout";

        // 쉼표 기준으로 1차 분리
        StringTokenizer logItems = new StringTokenizer(complexLog, ", ");

        System.out.println("활동 로그:");

        // 지시사항을 참고하여 코드를 작성해 주세요.

        StringBuilder sb = new StringBuilder();
        while(logItems.hasMoreTokens()){
            StringTokenizer tokenizer = new StringTokenizer(logItems.nextToken(), ";");
            String str = tokenizer.nextToken();
            if(str.equals("UserActivity")){
                sb.append("- Username: ").append(tokenizer.nextToken()).append(", Action: ").append(tokenizer.nextToken());
            } else if(str.equals("SystemAlert")){
                sb.append("- Component: ").append(tokenizer.nextToken()).append(", Status: ").append(tokenizer.nextToken());
            }

            sb.append("\n");
        }

        System.out.println(sb);
    }
}
