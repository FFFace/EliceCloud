public class App {
    public static void main(String[] args) throws Exception {
        Car c1 = new Car();
        c1.setColor("RED");
        c1.setModel("Hyundai Sonata");
        c1.setPower(180);

        Car c2 = new Car("BLUE","BMW 520",210);
        c1.go();
        c2.go();
    }
}
