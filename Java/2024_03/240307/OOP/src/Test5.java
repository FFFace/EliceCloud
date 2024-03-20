public class Test5 {
    public static void main(String[] args) {
        Character ch = new Character("헬로빗", "Hellobit", 30);

        ch.printDashboard();
        ch.increaseStat();

        ch.printDashboard();
        ch.increaseStat(30);

        ch.printDashboard();
        ch.increaseStat(10, "HP");

        ch.printDashboard();
        ch.increaseStat(10, "AP");

        ch.printDashboard();
    }
}
