package workbook10;

class Consumer {
    private int money;

    public Consumer(int money) {
        this.money = money;
    }
    // 지시사항 1번을 참고하여 코드를 작성하세요.
//    public boolean pay(String fruitname) {
//        switch (fruitname){
//            case "orange":
//                if(money >= 2000){
//                    money -= 2000;
//                    return true;
//                }
//                return false;
//
//            case "apple":
//                if(money >= 1000){
//                    money -= 1000;
//                    return true;
//                }
//                return false;
//        }
//
//        return false;
//    }

    public boolean pay(String fruitname) {
        return switch (fruitname) {
            case "orange" -> {
                if (money >= 2000) {
                    money -= 2000;
                    yield true;
                }
                yield false;
            }
            case "apple" -> {
                if (money >= 1000) {
                    money -= 1000;
                    yield true;
                }
                yield false;
            }
            default -> false;
        };

    }
}

class FruitStore {
    private int money = 0;
    private int appleCount = 2;
    private int orangeCount = 4;

    public int getMoney() {
        return money;
    }
    // 지시사항 2번을 참고하여 코드를 작성하세요.
    public void sell(Consumer c, String fruitname){
        if(c.pay(fruitname)){
            switch (fruitname){
                case "orange" -> money += 2000;
                case "apple" -> money += 1000;
            };
        }

        System.out.printf("과일가게의 수입은 %d원 입니다.\n", money);
    }
}

public class Main {
    public static void main(String args[]) {
        /* 아래 내용은 수정하지 마세요. */
        Consumer c = new Consumer(6000);  //6000원을 가진 고객 하나를 생성합니다.
        FruitStore f = new FruitStore();   //과일가게 하나를 생성합니다.

        f.sell(c,"apple");
        f.sell(c,"orange");
        f.sell(c,"apple");
        f.sell(c,"orange");
        f.sell(c,"orange");
    }
}
