public class Mammal extends  Animal{
    private String furColor;

    public Mammal(String name, int age, String furColor){
        super(name, age);
        this.furColor = furColor;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("털 색깔 : " + furColor);
    }
}
