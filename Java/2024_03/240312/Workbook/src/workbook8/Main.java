package workbook8;

class School {
    // 지시사항 1번을 참고하여 코드를 작성하세요.
    private static School s;
    // 지시사항 2번을 참고하여 코드를 작성하세요.
    public static School getInstance(){
        if(s == null){
            s = new School();
        }

        return s;
    }

    private int studentCount;

    public int getStudentCount() {
        return studentCount;
    }

    public void addStudent(int newStudentCount) {
        studentCount += newStudentCount;
    }

    private School() {
        studentCount = 0;
    }
}

public class Main {
    public static void main(String args[]) {
        // 지시사항 3번을 참고하여 코드를 작성하세요.
        School school1 = School.getInstance();

        school1.addStudent(4);
        // 지시사항 4번을 참고하여 코드를 작성하세요.

        School school2 = School.getInstance();
        school2.addStudent(3);

        System.out.println("학교의 학생 수 : " + school2.getStudentCount());
    }
}