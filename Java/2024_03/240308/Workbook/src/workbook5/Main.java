package workbook5;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("세단");
        car.drive();

        ElectricCar electricCar = new ElectricCar("전기차 세단");
        electricCar.drive();
    }
}
