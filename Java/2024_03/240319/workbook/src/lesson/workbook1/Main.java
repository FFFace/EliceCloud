package lesson.workbook1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> cards = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 20; i++) {
            cards.add(i);
        }

        int card = 0;
        while((card = scanner.nextInt()) != -1){
            int draw = cards.remove(card-1);
            cards.add(draw);
        }

        System.out.println(cards);
    }
}
