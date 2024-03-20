package lesson.workbook3;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> customers = new LinkedList<>();

        int input, id;
        while((input = scanner.nextInt()) != -1){
            switch (input){
                case 0:
                    id = scanner.nextInt();
                    customers.offerLast(id);

                    break;

                case 1:
                    id = scanner.nextInt();
                    customers.offerFirst(id);
                    break;

                case 2:
                    customers.poll();
                    break;

                default:
                    break;
            }
        }

        while (!customers.isEmpty()) {
            System.out.print(customers.poll() + " ");
        }
    }
}