package day30maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap01 {
    public static void main(String[] args) {
        /*
        1)  Map lerde sozluklerdeki gibi kelime ve manasi seklinde bir kullanim vardir
        2)  key kismi tekrarsiz, value kismi tekrarli olabilir
        3)  Map lerdeki her bir elemana Entry denir, tamamina ise EntrySet denir
        4)  Entry ler tekrarsiz oldugu icin EntrySet  denilir
        5)  Key ve value lar ayri ayri data typelarinda olabilirler
        6)  Map ler collection degildir, farkli bir yapidir
         */

        //Map nasil olusturulur?
        HashMap<String, Integer> countryPopulation = new HashMap<>();
        countryPopulation.put("Germany", 830000000);
        countryPopulation.put("Albania", 30000000);
        countryPopulation.put("USA", 400000000);
        countryPopulation.put("Turkey", 830000000);
        countryPopulation.put("Netherland", 1800000);

        System.out.println(countryPopulation);//{Netherland=1800000, USA=400000000, Turkey=830000000, Germany=830000000, Albania=30000000}

        // get() methodu key ile calisir ve value kismini verir.
        int usaPopulation = countryPopulation.get("Germany");
        System.out.println(usaPopulation);//830000000

        //Butun key leri nasil alabiliriz?
        Set<String> keys = countryPopulation.keySet();

        //Butun value lari nasil aliriz?
        Collection<Integer> values = countryPopulation.values();
        System.out.println(values);//[1800000, 400000000, 830000000, 830000000, 30000000]

        //Ornek 1: countryPopulation map indeki ulkelerin nufuslarinin ortalamsi kactir?
        Collection<Integer> value = countryPopulation.values();

        int sum = 0;
        for (int w: value){
            sum += w;
        }

        System.out.println(sum / value.size());//418360000

        //map lerle for each kullanamiyoruz.Bu yuzden java bize entrySet() methodu yapmis

        //entrySet() mapteki entryleri kalip halinde alip bize Set in icine koyarak verir.
        //<Map.Entry<String,Integer>> ==> bu map in icindeki entryler map in elemanidir
        //Loop lar mapler ile kullanilamaz, bunun icin entrySet() methodu kullaniriz
        // entrySet() methodu ile collection'a donusturulur
        Set<Map.Entry<String,Integer>> entries = countryPopulation.entrySet();
        System.out.println(entries);//[Netherland=1800000, USA=400000000, Turkey=830000000, Germany=830000000, Albania=30000000]

        //Ornek : countryPopulation mapindeki ulkelerin isimlerinin character sayisi ile nufuslarinin toplamini bulunuz

        int sum2 = 0;
        for (Map.Entry<String,Integer> w: entries){
            sum2 = sum2 + w.getKey().length() + w.getValue();
        }

        System.out.println(sum2);//2091800033

    }
}
