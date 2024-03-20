package workbook7;

class Passenger {
    private String name; //승객의 이름
    private int money; //승객이 가진 돈

    public Passenger(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public boolean pay() {
        //지시사항 1번을 참고하여 코드를 작성하세요.
        if(money >= 1000){
            money -= 1000;
            return true;
        }

        return false;
    }
}

class Bus {
    private int number; //버스의 번호
    private int passengerCount; // 승객의 수
    private int money; // 버스가 벌어들인 돈

    public Bus(int number) {
        this.number = number;
        passengerCount = 0;
        money = 0;
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    public int getMoney() {
        return money;
    }

    public int getNumber() {
        return number;
    }

    public void board(Passenger passenger) {
        //지시사항 2번을 참고하여 코드를 작성하세요.
        if(passenger.pay()) {
            passengerCount += 1;
            money += 1000;
        }
    }

    public void layoff() {
        //지시사항 3번을 참고하여 코드를 작성하세요.
        passengerCount = passengerCount > 0 ? passengerCount-1 : passengerCount;
    }
}

public class Main {
    public static void main(String args[]) {
        Passenger[] passengers = new Passenger[3];
        passengers[0] = new Passenger("Elice", 3000);
        passengers[1] = new Passenger("Alice", 1500);
        passengers[2] = new Passenger("Eris", 500);

        Bus bus = new Bus(1024);

        // 3명의 승객이 버스를 탑승하는 코드
        for (Passenger p : passengers) {
            bus.board(p);
        }


        System.out.println("현재 버스에는 " + bus.getPassengerCount() + "명의 승객이 탑승해 있습니다.");
        System.out.println("지금까지 " + bus.getNumber() + "번 버스의 수입은 " + bus.getMoney() + "원 입니다.");

        // 모든 승객이 내리는 코드

        while(bus.getPassengerCount() > 0) {
            bus.layoff();
        }

        System.out.println("현재 버스에는 " + bus.getPassengerCount() + "명의 승객이 탑승해 있습니다.");
        System.out.println("지금까지 " + bus.getNumber() + "번 버스의 수입은 " + bus.getMoney() + "원 입니다.");

        // 3명의 승객이 버스를 탑승하는 코드

        for (Passenger p : passengers) {
            bus.board(p);
        }

        System.out.println("현재 버스에는 " + bus.getPassengerCount() + "명의 승객이 탑승해 있습니다.");
        System.out.println("지금까지 " + bus.getNumber() + "번 버스의 수입은 " + bus.getMoney() + "원 입니다.");
    }
}