package RelationsBetweenClasses;

public class Main {
    public static void main(String[] args) {
        Student a = new Student("ebru", "ekin", 43, 55);
        Student b = new Student("ege", "sanel", 55, 67);
        Student c  = new Student("ece", "jdfhg", 34, 98);

        Course tarih = new Course("tarih", "TRH");

        System.out.println(tarih.getCourseName());

        Student[] std = {a,b,c};


        System.out.println(tarih.calcAvg(std));

     //   System.out.println(a.getId());
       // System.out.println(a.getNote());

        //System.out.println(b.getsName());

        //System.out.println(Student.count);
    }
}
