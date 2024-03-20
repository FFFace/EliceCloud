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

    // 주문을 확인하고 주문한 메뉴를 만드는 메서드 를 내부적으로 저수준 모듈로 나누어 구현해보는 건 어떨까요?
    // 예를 들면, 주문확인, 메뉴만들기, 메서드로 나누어 구현해보는 것입니다.
    // 이렇게 되면, 주문확인, 메뉴만들기 메서드를 다른 클래스에서도 사용할 수 있게 됩니다.
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
