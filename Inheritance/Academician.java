package Inheritance;

public class Academician extends Employee {
    private String dep;
    private String title;

    public Academician(String nameSname,String mpNo,String eposta,String dep,String title){
        super(nameSname, mpNo, eposta);
        this.dep = dep;
        this.title = title;        
    }

    public String getDep(){
        return this.dep;
    }

    public void setDep(String dep){
        this.dep = dep;
    }

    public String getTitle(){
        return this.title;
    }

    public void setTitle(String title){
        this.title = title;
    }
}
