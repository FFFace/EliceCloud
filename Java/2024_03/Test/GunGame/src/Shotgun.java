public class Shotgun extends Gun {

    public Shotgun(String model) {
        super(model);
    }
    
    public void fire(){
        bulletCount -= 1;
        System.out.printf("%s =} } } , %d\n", model, bulletCount);
    }
}
