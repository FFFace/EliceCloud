package test1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class Main {
    public static void main(String args[]) {
        //여기에 코드를 작성해주세요.    
        Scanner scanner = new Scanner(System.in);

        Stack<String> shopEventStack = new Stack<>();

        int shopItemNum = scanner.nextInt();
        int shopEventNum = scanner.nextInt();

        for(int i=0; i<=shopEventNum; i++){
            String inputStr = scanner.nextLine();
            String strs[] = inputStr.split(" ");

            switch(strs[0]){
                case "add":
                    shopEventStack.push(strs[1]);
                    break;

                case "remove":
                    shopEventStack.pop();
                    break;
            }
        }

        for(String str : shopEventStack){
            System.out.println(str);
        }
    }
}
