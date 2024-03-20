public class workbook3 {
    public static void main(String[] args) {
        //채점을 위한 코드이니 변경, 수정 하지말아주세요.
        Student student = new Student();
        student.setName("Alice");
        student.setAge(12);

        HighSchoolStudent highSchoolStudent = new HighSchoolStudent();
        highSchoolStudent.setName("Bob");
        highSchoolStudent.setAge(17);
        highSchoolStudent.setGrade(11);

        student.printDetails();
        highSchoolStudent.printDetails();
    }
}
