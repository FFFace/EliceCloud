package lesson.workbook5;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Menu {
    static private final Map<String, Integer> menuMap = new HashMap<>();
    static int value = 0;

    static public void execute(int instruction, String key, Integer value) {
        // 이곳에 답안을 작성해 주세요.
        switch (instruction){
            case 0:
            menuMap.put(key, value);
                break;
            case 1:
            menuMap.remove(key);
                break;

            case 2:
                if (!menuMap.containsKey(key)){
                    System.out.println("0");
                    return;
                }

                System.out.println(menuMap.get(key) * value);
        }
    }

    private Menu() {}
}
