public class Customer extends Person{
    private int money;
    private Drink drink;

    public Customer(String name, int money){
        super(name);
        this.money = money;
    }

    @Override
    public String getName() {
        return super.getName() + "(손님)";
    }

    public int getMoney() {
        return money;
    }

    public void takeDrinkFromClerk(Clerk clerk){
        drink = clerk.receiveOrderedDrinkFromCustomer(this);
        System.out.println(getName() + "이(가) 주문했던 메뉴를 받았습니다.");
        System.out.println("받은 메뉴 --- " + drink.getName());
        System.out.println(getName() + " : 감사합니다.");
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void smallTalk(Person other){
        super.hello();
        other.hello();
    }
}
