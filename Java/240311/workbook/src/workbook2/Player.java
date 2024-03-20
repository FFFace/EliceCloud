package workbook2;

public class Player extends Character{
    private int experience;

    public Player(String name, int level, int experience) {
        super(name, level);
        this.experience = experience;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("경험치 : " + experience);
    }
}
