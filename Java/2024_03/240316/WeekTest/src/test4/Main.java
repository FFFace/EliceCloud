package test4;

interface Car{
    String getName();
    int getTopSpeed();
}

abstract class AbstractCar implements Car{
    String name;
    int topSpeed;

    public AbstractCar(String name, int topSpeed){
        this.name = name;
        this.topSpeed = topSpeed;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getTopSpeed() {
        return topSpeed;
    }
}

class ElectricCar extends AbstractCar{

    public ElectricCar(String name, int topSpeed) {
        super(name, topSpeed);
    }
}

class GasolineCar extends AbstractCar{

    public GasolineCar(String name, int topSpeed) {
        super(name, topSpeed);
    }
}

public class Main {
    public static void main(String args[]) {
        Car electricCar = new ElectricCar("전기차", 250);
        Car gasolineCar = new GasolineCar("가솔린 자동차", 260);

        System.out.println(electricCar.getName() + ": " + electricCar.getTopSpeed());
        System.out.println(gasolineCar.getName() + ": " + gasolineCar.getTopSpeed());
    }
}