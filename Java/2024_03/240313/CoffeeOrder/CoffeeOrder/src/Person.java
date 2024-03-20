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


    // 만약 시스템이 확장되어 '사장'이라는 클래스가 추가된다면 어떻게 될까요?
    // 사장은 주문을 받을 수 없으므로 orderMenu 메서드를 구현할 수 없습니다.
    // 설계 관점에 따라 주의해야할 부분입니다.
    // SRP 원칙에 따라 '사장'은 주문을 받는 역할을 하지 않으므로 orderMenu 메서드를 구현하지 않아야 합니다.
//    public void orderMenu(Kiosk kiosk){
//
//    }
}