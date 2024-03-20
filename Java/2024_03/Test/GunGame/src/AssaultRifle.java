public class AssaultRifle extends Gun {

    public AssaultRifle(String model) {
        super(model);
        bulletCount = 40;
    }
    
    public void fire(){
        bulletCount -= 5;
        System.out.printf("%s => => => => => , %d\n", model, bulletCount);
    }
}
