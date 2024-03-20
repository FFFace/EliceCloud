public class Person {
    private String name;

    public Person(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void hello(){
        System.out.println(name + " : 안녕하세요.");
    }

    public void goodBye(){
        System.out.println(name + " : 다음에 뵙겠습니다.");
    }

    public void orderMenu(Kiosk kiosk){

    }
}