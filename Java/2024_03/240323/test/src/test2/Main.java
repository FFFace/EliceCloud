package test2;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int itemCount = scanner.nextInt();
        int logCount = scanner.nextInt();
        scanner.nextLine();

        Map<String, Integer> inventory = new LinkedHashMap<>();

        // 여기에 코드를 작성해주세요.
        for(int i=0; i<logCount; i++){
            String input = scanner.nextLine();
            String[] cmds = input.split(" ");

            switch (cmds[1]){
                case "acquire":
                    if(inventory.containsKey(cmds[0])) {
                        inventory.put(cmds[0], inventory.get(cmds[0]) + 1);
                    } else inventory.put(cmds[0], 1);
                    break;

                case "use":
                    if(inventory.containsKey(cmds[0])){
                        inventory.put(cmds[0], inventory.get(cmds[0]) - 1);
                    }
                    break;
            }
        }

        List<String> keyList = new java.util.ArrayList<>(inventory.keySet());
        Collections.sort(keyList);

        StringBuilder sb = new StringBuilder("{");
        for(int i=0; i<keyList.size(); i++){
            String key = keyList.get(i);

            sb.append(key).append("=");
            sb.append(inventory.get(key));

            if(i != keyList.size()-1){
                sb.append(", ");
            }
        }
        sb.append("}");

        System.out.println(sb);
    }
}
