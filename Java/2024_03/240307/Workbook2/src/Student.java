public class Student {

    private int number;
    private String name;


    public Student(){}
    public Student(String name, int number){
        this.name = name;
        this.number = number;
    }

    void study(){
        System.out.println(number +"\n" + name + "\n" + "Studying");
    }
}
