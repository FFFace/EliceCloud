import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer("김아무개", 10000);
        Kiosk kiosk = new Kiosk();
        Clerk clerk = new Clerk("박아무개", kiosk);

        kiosk.addNewMenu("아메리카노", 1500);
        kiosk.addNewMenu("카페라떼", 2000);
        kiosk.addNewMenu("카푸치노", 2500);

        kiosk.printMenu();
        System.out.print("무엇을 주문하시겠습니까? : ");

        Scanner scanner = new Scanner(System.in);
        String menu = scanner.nextLine();

        kiosk.order(menu, customer);

        if(clerk.checkOrderedAndMakeMenu()){
            customer.takeDrinkFromClerk(clerk);
        }
    }
}