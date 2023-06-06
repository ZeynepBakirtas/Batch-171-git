package day21arraylist;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayLists02 {
    public static void main(String[] args) {

        //Bir listin baska bir list ile ayni olup olmadigini nasil kontrol ederiz?
        //iki listin esit olabilmesi icin ayni index te ayni elemanlar olmalidir
        ArrayList<String> names1 = new ArrayList<>();
        names1.add("Tom");
        names1.add("Jim");
        names1.add("Kim");

        ArrayList<String> names2 = new ArrayList<>();
        names2.add("Tom");
        names2.add("Kim");
        names2.add("Jim");

        boolean s = names1.equals(names2);
        System.out.println(s);//false

        //Ornek: Verilen iki integer listte tamamiyla ayni elemanlarin olup olmadigini kontrol eden kodu yaziniz

        ArrayList<Integer> nums1 = new ArrayList<>();
        nums1.add(8);
        nums1.add(10);
        nums1.add(9);

        ArrayList<Integer> nums2 = new ArrayList<>();
        nums2.add(8);
        nums2.add(9);
        nums2.add(10);

        Collections.sort(nums1);
        Collections.sort(nums2);
        boolean result = nums1.equals(nums2);
        System.out.println(result);//true

        //ArrayListte bir elemanin ilk gorunumu nasil silinir?
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Miami");
        cities.add("Istanbul");
        cities.add("Yozgat");
        cities.add("Barcelona");
        cities.add("Miami");
        cities.add("Istanbul");
        cities.add("Istanbul");
        cities.add("Yozgat");
        System.out.println(cities);//[Miami, Istanbul, Yozgat, Barcelona, Miami, Istanbul, Istanbul, Yozgat]

        //remove() methodu bir elemanin ilk gorunumunu siler
        System.out.println(cities.remove("Miami"));//true
        System.out.println(cities);

        //Arraylistte bir eleman index kullanilarak nasil silinir?
        System.out.println(cities.remove(2));
        System.out.println(cities);

        //remove() methodu eleman ile kullanilirsa ilk gorunumu siler
        // ve o elemani silip silmedigini ifade eden true yada false return eder

        //remove() methodu index ile kullanilirsa bu indexte silmis oldugu datayi return eder

        //ArrayList olustururken sag tarafa(constructor) Arraylist yazmak zorundasiniz
        //Ama sol tarafa iste ArrayList yazin isterseniz de List yazin ikiside calisir
        //Detaylari collections konusunda gorecegiz

        //Ornek : Bir integer list olusturun ve 12 elemanini siliniz

        List<Integer> ages = new ArrayList<>();
        ages.add(23);
        ages.add(12);
        ages.add(7);
        ages.add(4);

        //1. yol
//        Integer nonPrimitive=12;
//        ages.remove(nonPrimitive);
//        System.out.println(ages);

        //2. yol Recommended
        ages.remove((Integer)12);
        System.out.println(ages);

//        //3. yol
//        ages.remove(Integer.valueOf(12));
//        System.out.println(ages);

        // 4. yol
//        System.out.println(ages);
//        ages.remove(ages.indexOf(12));
//        System.out.println(ages);

        //Bir ArrayListteki bir elemanin tum gorunumlerini nasil sileriz?
        //bir listteki bir elemanin tum gorunumlerini removeAll() ile silebiliriz
        // ama removeAll() methodu list ile kullanilir

        List<String >citiesToRemove = new ArrayList<>();
        citiesToRemove.add("Istanbul");
        citiesToRemove.add("Yozgat");

        cities.removeAll(citiesToRemove);
        System.out.println(cities);

    }
}
