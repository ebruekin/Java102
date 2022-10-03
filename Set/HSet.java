package Set;

import java.util.HashSet;

import java.util.Iterator;

//Collection interface’den kalıtım almıştır.
//Aynı elemanların veri kümesi içinde tekrar bulunmasına izin vermez.
//Eleman tekrarının olmamasını sağlayabilmek için veri kümesi içindeki nesnelerin “equals” ve “hashCode” fonksiyonlarının tanımlı olması gerekir.
// Set interface’in alt sınıfları: 
//HashSet --- LinkedHashSet --- TreeSet 


// HASHSET --> Liste tipinde veri tutmayı sağlar. Veri kümesindeki elemanlara ekleme, silme ve erişim imkanı tanır.
// Veri kümesinde tekrar eden değer tutmaz,nesnelerdeki hashCode fonksiyonunu kullanarak sağlar. “null” değer eklemesi yapılabilir.

public class HSet {
    public static void main(String[] args) {
        HashSet<String> h = new HashSet<>();
        h.add("a");
        h.add("b");
        h.add("c");
        h.add(null);

        h.remove("b");
        System.out.println("Size= " + h.size());
        System.out.println(h.contains("b"));

        for(String s : h){
            System.out.println(s);

        // Iterator kullanarak gezinmek
        Iterator<String> itr = h.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        }
    }

    
}
