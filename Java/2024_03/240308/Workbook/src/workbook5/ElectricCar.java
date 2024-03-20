package workbook5;

public class ElectricCar extends Car{

    public ElectricCar(String model) {
        super(model);
    }

    @Override
    public void drive() {
        System.out.println("전기차를 운전합니다.");
        setFuel(getFuel()-5);
        System.out.println("남은 연료 : " + getFuel());
    }
}
