public class HighSchoolStudent extends  Student{
    private int grade;



    public int getGrade(){
        return grade;
    }

    public void setGrade(int grade){
        this.grade = grade;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("학년 : " + grade);
    }
}
