public class Student {
    private String name;
    private int age;



    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void printDetails(){
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
    }
}
