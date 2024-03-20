public class Test3 {
    public static void main(String[] args) {
        Character ch1 = new Character();
        Character ch2 = new Character();

        ch1.name = "헬로빗";
        ch1.nickname = "Hellobit";
        ch1.AP = 30;

        ch2.name = "캐터필러";
        ch2.nickname = "Caterpillar";

        ch2.AP = 50;

        ch1.printDashboard();
        ch2.printDashboard();


        ch1.attack(ch2);
        ch2.attack(ch1);

        ch1.printDashboard();
        ch2.printDashboard();

        System.out.println(ch1.getNthItemFromInventory(1));
        System.out.println(ch2.getNthItemFromInventory(2));
    }
}
