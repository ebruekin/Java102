package OOPpractices.prac1;


public class Main {
    public static void main(String[] args) {
        Employee e = new Employee("ece", 1997, "istan");
        Employee b = new Employee("ece", 1997, "istan");
        Employee k = new Employee("ece", 1997, "istan");

        Employee[] x = {e,b,k};
        Employee.print(x);
    }
}
