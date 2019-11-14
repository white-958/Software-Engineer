


import java.util.ArrayList;


public class Student {
    private int id;
    private String name;
    private String surname;
    private String email;
    private int phone;
    private String adress;
    private char exam;
    private int AFM;
    ArrayList<String> ListOfAitiseis;
    Dilwseis listCourses[]=new Dilwseis[6];
    static int i=0;
    Student(int id, String name, String surname, char exam) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phone = phone;
        this.adress = adress;
        this.exam = exam;
        this.AFM = AFM;
        ListOfAitiseis= new ArrayList<String>();
    }

  
    public void getData(){
        System.out.println(
            this.id +"\n"+
            this.name+"\n"+
            this.surname+"\n"+
            this.email +"\n"+
            this.phone+"\n"+
            this.adress+"\n"+
            this.exam+"\n"+
            this.AFM +"\n" 
        );
    
    }
    public void ADDListOfAitiseis(String str){
        ListOfAitiseis.add(str);
    }
    public void printAitiseis(){
        System.out.println("AITISEIS");
        for(String data: ListOfAitiseis ){
            System.out.println(data);
        }
    }
    
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public char getExam() {
        return exam;
    }
    
}
