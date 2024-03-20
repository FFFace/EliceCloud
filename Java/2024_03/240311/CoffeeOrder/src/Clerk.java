public class Clerk extends Person {

    private Kiosk kiosk;
    private Drink orderedDrink;


    public Clerk(String name, Kiosk kiosk){
        super(name);
        this.kiosk = kiosk;
    }

    @Override
    public String getName() {
        return super.getName() + "(점원)";
    }

    public Drink receiveOrderedDrinkFromCustomer(Customer customer){
        if(orderedDrink == null){
            System.out.println("완성된 음료가 없습니다!");
            return null;
        }

        System.out.println(getName() + " : 주문하신 메뉴 나왔습니다.");
        kiosk.orderComplete();
        return orderedDrink;
    }

    public boolean checkOrderedAndMakeMenu(){
        System.out.println(getName() + "이(가) 주문을 확인합니다.");
        if(kiosk.checkOrderedMenu()) {
            System.out.println("주문을 확인했습니다.");
            orderedDrink = makeOrderedMenu(kiosk.getOrderedName());
            return true;
        }
        System.out.println("주문 받은 메뉴가 없습니다.");
        return false;
    }

    private Drink makeOrderedMenu(String drinkName){
        if(drinkName == null){
            System.out.println("주문 받은 메뉴가 없습니다!");
            return null;
        }

        System.out.println("주문 받은 메뉴를 만드는 중 입니다...");

        Drink drink = new Drink(drinkName);

        System.out.println("주문 받은 메뉴를 만들었습니다!");

        return drink;
    }
}
