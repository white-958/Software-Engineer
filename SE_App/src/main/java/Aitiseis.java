


import java.util.Calendar;


public class Aitiseis {
    private String email;
    private String surname;
    private String name;
    private char exam;

    public Aitiseis(String email, String surname, String name, char exam) {
        this.email = email;
        this.surname = surname;
        this.name = name;
        this.exam = exam;
    }
 
    public String CreateNewAitisi(){
        int year=Calendar.getInstance().get(Calendar.YEAR);
        String bebaiosi="Βεβαίωση Σπουδών\n"
                        +"Βεβαιώνεται ότι, όπως προκύπτι απο τα στοιχεία του Τμήματος, η/ο "+surname+" "+name
                        +"είναι φοιήτρια του ΤΜΗΜΑΤΟΣ ΜΗΧΑΝΙΚΩΝ ΠΛΗΡΟΦΟΡΙΚΗΣ Τ.Ε. της ΣΧΟΛΗΣ "
                        +"ΤΕΧΝΟΛΟΓΩΝ ΕΦΑΡΜΟΓΩΝ του ΔΙΕΘΝΕΣ ΠΑΝΕΠΙΣΤΙΜΙΟΥ ΕΛΛΑΔΟΥΣ στο "+exam
                        +" τυπικό εξάμηνο σπουδών του ακαδημαικού έτους "+year+"-"+(year-1);
        return bebaiosi;

    }
    

}
