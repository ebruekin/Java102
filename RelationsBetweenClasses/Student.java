package RelationsBetweenClasses;

public class Student {
    private String name;
    private String sName;
    private int id;
    private int note; 
    public static int  count;

    public Student(String name, String sName,int id, int note){
        this.name = name;
        this.sName =sName;
        this.id = id;
        if(this.note > 100 || this.note < 0){
            this.note = 0;
        }else{
            this.note = note;
        }
        count++;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getsName(){
        return this.sName;
    }

    public void setsName(String sName){
        this.sName = sName;
    }

    public int getId(){
        return this.id;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getNote(){
        return this.note;
    }

    public void setNote(int note){
        this.note = note;
    }


}
