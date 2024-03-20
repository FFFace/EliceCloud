public class Order {
    String menu = "아메리카노";
    int price = 4000;

    public void printOrderInfo(){
        System.out.println("주문한 메뉴는 "+ menu + ", 가격은 " + price + "원입니다.");
    }
}
