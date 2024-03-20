public class workbook2 {
    public static void main(String[] args) {
        Character character = new Character("Knight", 10);
        Player player = new Player("Mage", 15, 1000);

        character.printDetails();
        player.printDetails();
    }
}
