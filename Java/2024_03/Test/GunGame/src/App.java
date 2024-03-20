public class App {
    public static void main(String[] args) throws Exception {
        Gun sgun = new Shotgun("S12k");
        Gun agun = new AssaultRifle("M416");

        sgun.fire();
        agun.fire();
    }
}
