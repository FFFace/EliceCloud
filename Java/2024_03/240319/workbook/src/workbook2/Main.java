package workbook2;

import java.util.*;

public class Main {
    public static void main(String args[]) {
        // 채점을 위한 코드이므로 수정하지 말아주세요.
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();

        System.out.println(solution(s));
    }


    public static boolean solution(String s) {
        // 지시사항에 따라 코드를 작성해 주세요.
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            stack.push(c);
        }

        if(stack.size() % 2 != 0)
            return false;

        boolean isOpen = false;
        int leftCount = 0;

        for (Character word : stack) {
            if (!isOpen && word.equals(')'))
                return false;

            if (word.equals('('))
                leftCount++;
            else if (word.equals(')'))
                leftCount--;
            else
                return false;

            if (leftCount == 0)
                isOpen = false;
            else
                isOpen = true;
        }

        return true;
    }
}