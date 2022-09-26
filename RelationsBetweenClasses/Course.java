package RelationsBetweenClasses;

public class Course {
    private String courseName;
    private String code;

    public Course(String courseName,String code){
        this.courseName = courseName;
        this.code = code;
    }

    public String getCourseName(){
        return this.courseName;
    }

    public void setCourseName(String courseName){
        this.courseName = courseName;
    }

    public String getCode(){
        return this.code;
    }

    public void setCode(String code){
        this.code =  code;
    }


    // "uses a" ilişkisi, eğer bir sınıfın metotlarından en az biri başka bir sınıfa ait bir parametre alıyorsa, parametre alan metoda ait sınıf diğeri sınıfa bağımlıdır ya da onu kullanır (uses) denir.
    public double calcAvg(Student[] students){
        double avr = 0.0;
        for(int i = 0 ; i < students.length;i++){
            avr += students[i].getNote();
        }
        return avr / students.length;

    }
 
    

}
