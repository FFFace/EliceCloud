package workbook4;

public class Vehicle {
    private int wheel;

    private class Car{
        Car(){
            wheel = 4;
        }

        public void printWheels(){
            System.out.println("자동차의 바퀴 수는 " + wheel + "개입니다.");
        }
    }

    private class Bicycle{
        Bicycle(){
            wheel = 2;
        }

        public void printWheels(){
            System.out.println("자전거의 바퀴 수는 " + wheel + "개입니다.");
        }
    }

    public void printWheels() {
        Car car = new Car();
        car.printWheels();

        Bicycle bicycle = new Bicycle();
        bicycle.printWheels();
    }
}
