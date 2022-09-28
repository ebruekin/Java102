package InterfacesS;

public class Main {
    public static void main(String[] args) {
        BankA garanti = new BankA("garanti", "34", "123Garanti");
        BankB ziraat = new BankB("ziraat", "23", "123Ziraat");

        garanti.connect("3435345");
        ziraat.payment(10.7 ,"123456", "12.2.2022", "312"); 

    }   
    
}
