package Inheritance;

public class Asistant extends Academician{
    private String ofClock;
    public Asistant(String nameSname,String mpNo,String eposta,String dep,String title,String ofClock){
        super(nameSname, mpNo, eposta, dep, title);
        this.ofClock = ofClock;
    }

    public String getClock(){
        return this.ofClock;
    }

    public void setClock(String ofClock){
        this.ofClock = ofClock;
    }
}
