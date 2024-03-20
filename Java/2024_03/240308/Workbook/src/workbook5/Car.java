package workbook5;

public class Car {
    private String model;
    private double fuel = 100.0;

    public Car(String model){
        this.model = model;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public void drive(){
        fuel -= 10;
        System.out.println("자동차를 운전합니다.");
        System.out.println("남은 연료 : " + fuel);
    }
}
