package workbook4;

import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        String complexLog = "UserActivity;user1;login, SystemAlert;Memory;Critical, UserActivity;user2;logout";

        // 쉼표 기준으로 1차 분리
        StringTokenizer logItems = new StringTokenizer(complexLog, ", ;");

        System.out.println("활동 로그:");

        // 지시사항을 참고하여 코드를 작성해 주세요.
//        logItems.nextToken();
//        System.out.println("- Username: " + logItems.nextToken() + ", Action: " + logItems.nextToken());
//        logItems.nextToken();
//        System.out.println("- Component: " + logItems.nextToken() + ", Status: " + logItems.nextToken());
//        logItems.nextToken();
//        System.out.println("- Username: " + logItems.nextToken() + ", Action: " + logItems.nextToken());
        StringBuilder sb = new StringBuilder();

        while(logItems.hasMoreTokens()){

            String str = logItems.nextToken();
            if(str.equals("UserActivity")) {
                sb.append("- Username: ").append(logItems.nextToken()).append(", Action: ").append(logItems.nextToken()).append("\n");
            } else if(str.equals("SystemAlert")){
                sb.append("- Component: ").append(logItems.nextToken()).append(", Status: ").append(logItems.nextToken()).append("\n");
            }
        }

        System.out.println(sb);
    }
}
