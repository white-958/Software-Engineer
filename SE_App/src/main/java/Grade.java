



public class Grade extends Courses {
    int grade;
    
    public Grade(int id, String name, char exam,int grade) {
        super(id, name, exam);
        this.grade=grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
    

}
