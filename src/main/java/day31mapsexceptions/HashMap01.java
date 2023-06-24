package day31mapsexceptions;

import java.util.HashMap;

public class HashMap01 {
    public static void main(String[] args) {

        //HashMap arkasinda calisan mekanizma nasil?
        HashMap<String, String> capitals = new HashMap<>();
        capitals.put("USA", "Washington");//34/12 ==> kalan 2 ==> Bucket ta ikinci indekse ekler
        capitals.get("USA");
        capitals.put("Italy", "Roma");//65/12 ==> kalan 1 ==> Bucket ta birinci indekse ekler
        capitals.put("Turkiye", "Ankara");//82/16 ==> kalan 2 ==> Bucket ta ikinci indekse ekler
        capitals.put("Italy", "Floransa");//Ayni key e yeni bir value yazdigimizda overWrite yapar.


        //Birden fazla ayni indekse sahip veri eklenirse java linkedList gibi ekler. Cagirildiginda tek tek kontrol eder
        //Hash teknigi kullanmanin amaci uniq olmasi
    }
}
