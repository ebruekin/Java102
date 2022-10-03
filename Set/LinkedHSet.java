package Set;

import java.util.Iterator;
import java.util.LinkedHashSet;

// LinkedHashSet, tüm öğeler arasında çift bağlantılı bir Liste tutan sıralı bir HashSet sürümüdür.
// Yineleme sırasının korunması gerektiğinde bu sınıf kullanılır.

public class LinkedHSet {
    public static void main(String[] args) {
        LinkedHashSet<String> h = new LinkedHashSet<>();
        h.add("sunday");
        h.add("monday");
        h.add("tuesday");
        h.add("wednesday");
        h.add("thursday");
        h.add("friday");
        h.add("saturday");
        

        h.remove("friday");

        System.out.println("Size = " + h.size());
        

        Iterator<String> itr = h.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
