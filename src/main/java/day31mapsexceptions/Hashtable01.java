package day31mapsexceptions;

import java.util.Hashtable;

public class Hashtable01 {
    /*
    HashMap ile Hashtable arasindaki fark nedir?
        1) HashMap thread-safe(ayni anda birden fazla is, multithread ayni sey) ve synchronized degildir,
            Hashtable thread-safe ve synchronized dir.
        2) HashMap bir tane null key e ve istediginiz kadar null value a musaade eder
            Hashtable keylerde ve valuelarda null kullanilmasina musaade etmez
        3) HashMap hizlidir, Hashtable hashmaplere gore yavastir

        NOTE: HashMap ve Hashtable ikiside entry leri rastgele siralar
     */
    public static void main(String[] args) {

        Hashtable<String, Integer> stdAges = new Hashtable<>();
        stdAges.put("Mustafa", 41);
        stdAges.put("Seda", 30);
        stdAges.put("Ekim", 22);
        stdAges.put("Ali Can", 18);
        //stdAges.put(null, 15); null hem key de ve value da eklenemiyor
        //stdAges.put("Mehmet", null);
    }
}
