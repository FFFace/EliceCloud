public abstract class Robot {
    private String name;

    public void move(){
        System.out.println("Robot Move !!");
    }

    abstract void charging();

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}
