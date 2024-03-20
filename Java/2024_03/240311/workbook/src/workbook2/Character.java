package workbook2;

public class Character {
    public String name;
    protected int level;

    public Character(String name, int level){
        this.name = name;
        this.level = level;
    }

    public void printDetails() {
        System.out.println("이름 : " + name);
        System.out.println("레벨 : " + level);
    }
}
