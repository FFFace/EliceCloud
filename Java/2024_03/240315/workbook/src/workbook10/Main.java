package workbook10;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("암호화할 원본 메시지를 입력하세요:");
        String originalMessage = scanner.nextLine();

        String encryptedMessage = encryptMessage(originalMessage, random);

        System.out.println("암호화된 메시지:");
        System.out.println(encryptedMessage);
    }

    protected static String encryptMessage(String message, Random random) {

        // 지시사항을 참고하여 코드를 작성하세요.
        char[] messageChars = message.toCharArray();
        for(int i=0; i<messageChars.length; i++){
            if(!Character.isAlphabetic(messageChars[i])) continue;
            int index = Character.isLowerCase(messageChars[i]) ? 'a' : 'A';
            int alp = index + random.nextInt(26);
            messageChars[i] = (char) alp;
        }
        return new String(messageChars);
    }
}
