package Inheritance;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("sdsd sds", "4535", "fddg@fsdf");

        Employee e2 = new Academician("fdff fsdf", "4234234", "gfdg@fsdf", "Eng", "prof");

        Academician a1 = new Academician("fdf faaaf", "434", "acadeg@fsdf", "ng", "prof");

        Asistant as1 = new Asistant("jhgdfgh", "23", "as@asistan", "Eng", "eng assistant", "12.20");

        System.out.println(e2.getMpNo());
        System.out.println(a1.getDep());
        System.out.println(e1.getNameSname());
        System.out.println(as1.getNameSname());

    }
}
