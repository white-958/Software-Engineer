



public class Courses {
    int id;
    String name;
    char exam;

    Courses(int id, String name, char exam) {
        this.id = id;
        this.name = name;
        this.exam = exam;
    }
    
    Courses list[]={new Courses(001,"Μηχανική λογισμικου",'A'),
                    new Courses(002,"Java",'A'),
                    new Courses(003,"Java UI",'B'),
                    new Courses(004,"Δεξιοτητες επικοινωνίας",'B'),
                    new Courses(005,"Δίκτυα Υπολογιστών",'C'),
                    new Courses(006,"SQL",'C'),
                    new Courses(007,"Database",'E'),
                    new Courses(010,"Server",'E')
                    };
    
    public String printProgramm(){
        String sA="Exam A :\n";
        String sB="Exam B :\n";
        String sC="Exam C :\n";
        String sE="Exam E :\n";
          for(Courses lesson: list){
              switch(lesson.exam){
              
                case 'A':
                      sA+=lesson.id+"\t"+lesson.name+"\t"+lesson.exam+"\n";
                case 'B':
                      sB+=lesson.id+"\t"+lesson.name+"\t"+lesson.exam+"\n";
                case 'C':
                      sC+=lesson.id+"\t"+lesson.name+"\t"+lesson.exam+"\n";
                case 'E':
                      sE+=lesson.id+"\t"+lesson.name+"\t"+lesson.exam+"\n";
              }
          }
    return sA+"\n"+sB+"\n"+sC+"\n"+sE+"\n";
    }
}
