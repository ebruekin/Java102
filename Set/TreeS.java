package Set;

import java.util.Comparator;

import java.util.TreeSet;

// Veri kümesine konulan elemanların verdiğiniz kurala göre sıralanmasını sağlar. 
// Bunun sağlanabilmesi için kullanacağınız sınıfın “sıralanabilir” olması gerekmektedir.
// Bir sınıfın sıralanabilir olması için “Comparable” interface’den kalıtım alıp “compareTo” metodunu doldurması gerekmektedir.
//  Nesne üzerindeki “compareTo” fonksiyonu küçükten büyüğe doğal sıralama imkanı sağlar.
class Student{
    private String name;
    private int note;

    public Student(String name,int note){
        this.name = name;
        this.note = note;
    }

    public String getName(){
        return this.name;
    }

    public int getNote(){
        return this.note;
    }
}

class NoteComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        
        return o1.getNote() - o2.getNote();
    }
    
}

public class TreeS {
    public static void main(String[] args) {
        // TreeSet<Integer> numbers = new TreeSet<>();
        // numbers.add(10);
        // numbers.add(1022);
        // numbers.add(1);
        // numbers.add(-10);
        // numbers.add(22);     
        
        TreeSet<Student> students = new TreeSet<>(new NoteComparator());
        students.add(new Student("ece", 87));
        students.add(new Student("simge", 77));
        students.add(new Student("ahmet", 56));
        students.add(new Student("veli", 98));

        for(Student s : students){
            System.out.println(s.getNote());
        }

    }
}
