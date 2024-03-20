public class Test6 {
    public static void main(String[] args) {
        Character ch1 = new Character("헬로빗");
        Character ch2 = new Character("헬로빗", 30);
        Character ch3 = new Character("헬로빗", "Hellobit");
        Character ch4 = new Character("헬로빗", "Hellobit", 30);

        ch1.printDashboard();
        ch2.printDashboard();
        ch3.printDashboard();
        ch4.printDashboard();
    }
}
