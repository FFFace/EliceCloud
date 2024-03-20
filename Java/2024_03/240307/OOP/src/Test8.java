public class Test8 {
    static void scenario(Character ch1, Character ch2, Character enemy) {
        ch1.printDashboard();
        ch2.printDashboard();
        enemy.printDashboard();

        ch1.addItem("포션");
        ch2.addItem("열매");

        ch1.giveItem(ch2, "포션");
        ch2.giveItem(ch1, "열매");

        ch1.attack(enemy);
        ch2.attack(enemy);

        ch1.increaseStat(20, "AP");
        ch2.increaseStat(20, "AP");

        ch1.printDashboard();
        ch2.printDashboard();
        enemy.printDashboard();
    }

    public static void main(String[] args) {
        Character hellobit = new Character("헬로빗", "Hellobit", 30);
        Character caterpillar = new Character("캐터필러", "Caterpillar", 50);
        Character monster = new Character("괴물", "Monster", 50);

        scenario(hellobit, caterpillar, monster);
    }
}
