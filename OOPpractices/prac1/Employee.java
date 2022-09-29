package OOPpractices.prac1;

public class Employee {
    String name;
    int joining;
    String addr;

    public Employee( String name, int joining, String addr){
        this.name = name;
        this.joining = joining;
        this.addr = addr;
    }

    public void info(){
        
        System.out.println(this.name+ "  "+  this.joining + "  "+ this.addr);
    }

    public static void print(Employee[] arr){
        System.out.println("Name " + "Joining " + "Adrres");
        for(Employee e : arr){
            e.info();
    }
}
}