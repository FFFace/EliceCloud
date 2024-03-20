public class Test2 {
    public static void main(String[] args) {
        Character ch = new Character();

        ch.name = "헬로빗";
        ch.nickname = "Hellobit";

        ch.printDashboard();
        System.out.println(ch.isInventoryEmpty());
    }
}
