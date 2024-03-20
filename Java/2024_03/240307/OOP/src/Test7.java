public class Test7 {
    public static void main(String[] args) {
        Character ch1 = new Character("헬로빗", "Hellobit", 30);
        Character ch2 = new Character("캐터필러", "Caterpillar", 50);

        ch1.printDashboard();
        ch2.printDashboard();

        ch1.addItem("포션");
        ch1.addItem("칼");
        ch1.addItem("열매");

        ch1.giveItem(ch2, "칼");

        ch1.printDashboard();
        ch2.printDashboard();

        System.out.println(ch1.getNthItemFromInventory(1));
        System.out.println(ch1.isInventoryEmpty());
    }
}
