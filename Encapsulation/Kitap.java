package Encapsulation;

//Encapsulation bir sınıfa ait değişkenlerin veya niteliklerin ancak o sınıfa ait metotlar tarafından değiştirilebilmesi ve okunabilmesi ilkesidir.
// Bu ilke sayesinde nesnelerde oluşacak anlamsızlıkların önüne geçilebilir.
public class Kitap {
    private int sayfaSayisi;
    private String kitapAdi;
    private String yazar;

    Kitap(String kitapAdi,int sayfaSayisi,String yazar){
        this.kitapAdi = kitapAdi;
        this.sayfaSayisi  = sayfaSayisi;
        this.yazar = yazar;
        if (sayfaSayisi < 1) {
			this.sayfaSayisi = 10;
		} else {
			this.sayfaSayisi = sayfaSayisi;
		}
    }

    //Sınıfta private değişkenler mevcut. Bu değişkenlere dışarıdan erişebilmek için her bir değişkenimiz için Getter metodu yazmalıyız
    public int getSayfaSayisi(){
        return this.sayfaSayisi;
    }


    //getter metodu ile private olan değişkenimize ulaştık.
    //Bir sınıfa ait private bir değişkenin değerini değiştirmek için, setter metodu yazılmalıdır.
    public void setSayfaSayisi(int sayfaSayisi){
        this.sayfaSayisi = sayfaSayisi;
    }

    public String getKitapAdi(){
        return this.kitapAdi;
    }

    public void setKitapAdi(String kitapAdi){
        this.kitapAdi = kitapAdi;
    }

    public String getYazar(){
        return this.yazar;
    }

    public void setYazar(String yazar){
        this.yazar = yazar;
    }

    
}
