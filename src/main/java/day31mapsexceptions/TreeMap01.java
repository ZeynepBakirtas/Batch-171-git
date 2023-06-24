package day31mapsexceptions;

import java.util.HashMap;
import java.util.TreeMap;

public class TreeMap01 {
    public static void main(String[] args) {
        /*
       1) TreeMap "thread safe" synchronized degildir.
            NORE: Maplerde multi thread kullanmamiz gerektiginde sadece Hashtable kullanabilirsiniz
       2) TreeMap entry leri key lerine gore natural order a gore siralar. Bu yuzden coook yavastir
       3) TreeMaplerin keylerine null kullanilamaz, ama value larinda istediginiz kadar kullanabilirsiniz
         */

        long t0 = System.nanoTime();

        TreeMap<String, Integer> countryPopulations = new TreeMap<>();
        countryPopulations.put("USA", 400000);
        countryPopulations.put("Netherland", 18000000);
        countryPopulations.put("Turkey", 830000);
        countryPopulations.put("Belgium", 120000);
        countryPopulations.put("Brasil", 2120000);
        countryPopulations.put("France", 750000);
        countryPopulations.put("Finland", 8000000);
        countryPopulations.put("Germany", 8500000);
        System.out.println(countryPopulations);//{Belgium=120000, Brasil=2120000, Finland=8000000, France=750000, Germany=8500000, Netherland=18000000, Turkey=830000, USA=400000}

        long t1 = System.nanoTime();

        HashMap<String, Integer> countryPop = new HashMap<>();
        countryPop.put("USA", 400000);
        countryPop.put("Netherland", 18000000);
        countryPop.put("Turkey", 830000);
        countryPop.put("Belgium", 120000);
        countryPop.put("Brasil", 2120000);
        countryPop.put("France", 750000);
        countryPop.put("Finland", 8000000);
        countryPop.put("Germany", 8500000);

        TreeMap<String, Integer> countryPopTree = new TreeMap<>(countryPop);
        System.out.println(countryPopTree);//{Belgium=120000, Brasil=2120000, Finland=8000000, France=750000, Germany=8500000, Netherland=18000000, Turkey=830000, USA=400000}

        long t2 = System.nanoTime();

        System.out.println(t1-t0);//treeMap 2023385
        System.out.println(t2-t1);//hashMap 242814
    }
}
