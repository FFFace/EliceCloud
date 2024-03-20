package workbook5;

class Student {
    private int number;
    private String name;

    public Student(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Elice", 1004);
        student.setNumber(1234);
        System.out.println(student.getName() + "학생의 학번 : " + student.getNumber());
    }
}
