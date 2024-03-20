package workbook3;


abstract class Plan {
    private int time;
    static int price;

    Plan(int t, int p) {
        this.time = t;
        price = p;
    }

    private void changeState() {
        this.time -= 1;
        price -= 1;
    }

    public void complete() {
        this.time = 0;
    }

    private void checkState() {
        System.out.println("남은 예산은 " + price + "이며 " + time + " 기간 소요될 것으로 보입니다");
    }

    public void processing() {
        changeState();
        if(price <= 0) {
            System.out.println("\n!예산이 부족합니다!");
        } else if(this.time <= 0) {
            System.out.println("\n!작업이 완료 되었습니다!");
        } else {
            System.out.println("\n 작업 진행중.. ");
            checkState();
        }
    }

    abstract void upgrading();
}

class DevelopedPlan extends Plan {

    DevelopedPlan(int t, int p) {
        super(t, p);
    }

    void upgrading() {
        super.complete();
        System.out.println("\n작업을 바로 완료합니다!");
    }
}

public class Main {
    public static void main(String args[]) {

        DevelopedPlan a = new DevelopedPlan(5, 10);
        a.processing();
        a.processing();
        a.processing();
        a.upgrading();
        a.processing();


    }
}
