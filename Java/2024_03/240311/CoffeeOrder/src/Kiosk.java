import java.util.ArrayList;

public class Kiosk {
    private ArrayList<Drink> menu = new ArrayList<>();
    private ArrayList<Drink> orderedMenu = new ArrayList<>();
    private int totalSales = 0;


    public void addNewMenu(String name, int price){
        Drink newDrink = new Drink(name, price);

        menu.add(newDrink);
    }

    public void printMenu() {
        for (Drink drink : menu) {
            System.out.println(drink.getName() + " ---- 가격 : " + drink.getPrice());
        }
    }
    
    public String getOrderedName(){
        if(!orderedMenu.isEmpty()){
            return orderedMenu.getFirst().getName();
        }

        System.out.println("주문 받은 메뉴가 없습니다!");
        return null;
    }

    public void order(String name, Customer customer) {
        for(Drink drink : menu){
            if(drink.getName().equals(name)){
                if(customer.getMoney() >= drink.getPrice()){
                    addorderedMenu(drink);
                }
                else {
                    System.out.println("결제 금액이 부족합니다. 가격을 확인 해 주세요.");
                }

                return;
            }
        }

        System.out.println("해당하는 메뉴가 없습니다. 주문을 다시 확인 해 주세요.");
    }

    private void addorderedMenu(Drink drink){
        orderedMenu.add(drink);
        totalSales += drink.getPrice();
        System.out.println(drink.getName() + "을(를) 주문 받았습니다. 잠시만 기다려 주세요...");
    }

    public boolean checkOrderedMenu(){
        return !orderedMenu.isEmpty();
    }

    public void orderComplete(){
        if(orderedMenu.isEmpty()){
            return;
        }

        orderedMenu.removeFirst();
    }
}
