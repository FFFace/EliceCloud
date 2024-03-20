public class RobotDog extends Robot implements Pet {
    public static void main(String[] args) throws Exception {
        RobotDog rd = new RobotDog();
        rd.setName("robo dog");
        rd.bark();
        rd.move();
        rd.charging();
    }

    @Override
    public void bark() {
        System.out.println("Woof Woof~");
    }

    @Override
    void charging() {
        System.out.println(getName() + " go to charging station");
    }
}
