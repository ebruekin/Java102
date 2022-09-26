package Encapsulation;

public class Main {
    public static void main(String[] args) {
        Kitap k1 = new Kitap("harry potter", 43, "ali");
        System.out.println(k1.getSayfaSayisi());

        k1.setKitapAdi("gece");

        System.out.println(k1.getKitapAdi());

        

    }
}
