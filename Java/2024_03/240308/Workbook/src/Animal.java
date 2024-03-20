public class Animal {
    private String name;
    private int age;

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void printDetails(){
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
    }
}
