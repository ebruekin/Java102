package Inheritance;

public class Employee {
    private String nameSname;
    private String mpNo;
    private String eposta;

    public Employee(String nameSname,String mpNo,String eposta){
        this.nameSname = nameSname;
        this.mpNo = mpNo;
        this.eposta = eposta;
    }
    public String getNameSname(){
        return this.nameSname;
    }

    public void setNameSname(String nameSname){
        this.nameSname = nameSname;
    }

    public String getMpNo(){
        return this.mpNo;
    }

    public void setMpNo(String mpNo){
        this.mpNo = mpNo;
    }

    public String getEposta(){
        return this.eposta;
    }

    public void setEposta(String eposta){
        this.eposta = eposta;
        
    }

}
