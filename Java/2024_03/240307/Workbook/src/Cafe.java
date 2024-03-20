import java.util.Arrays;

public class Cafe {

    public String menu;
    public int price = 3000;

    Cafe(String menu){
        this.menu = menu;
    }

    Cafe(String menu, int price){
        this(menu);
        this.price = price;
    }

    // 여기에 생성자 메서드를 작성해주세요.

    public void printMenuInfo() {
        System.out.println(menu + "은 " + price + "원입니다.");
    }
}
