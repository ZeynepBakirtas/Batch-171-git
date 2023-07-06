package day34lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Lambda01 {
    public static void main(String[] args) {
        /*
        1) Lambda "Functional Programming" (Islevsel programlama) dir, digeri "Structured Programming" (Yapisal programlama)
        2) "Functional Programming'te" "Ne yapilacak" (What to do) uzerine yogunlasilir
           "Structured Programming'te" "Nasil yapilacak" (How to do) uzerine yogunlasilir

        >map() methodu stream de bulunana her bir elemanda degisiklik yapilacagi zaman kullanilir.
        >filter() methodu stream icerisinde belirli datalari cekmek icin kullanilir
        >stream() methodu listteki elemanlari akis haline getirir. Hafizada yer tutmaz.
        >forEach() methodu streamdeki her elemani alip yazdirmaya yarar. Her bir oge icin islem yapmaya yarar.
        >distinct() methodu stream deki elemanlarin tekrarsiz olanlarak kullanmaya yarar. stream den sonra kullanmak
            Java'yi yormamak icin best practice.
        >reduce() streamde coklu datanin tek bir dataya indirgenecegi (reduction) zaman kullanilir.
            reduce() methodu optional data type na cevirir
            identity ==> etkisiz eleman yazilir
            t baslangic degerini identity den alir, sonraki degerlerini action dan alir
            u tum degerlerini streamden alir
            t identity olmadigindan degerini streamden alir u da streamdeki diger degeri alir
            identity kullanmadigimizda Optional veri dondurur.
        >get() methodu Optional <Integer>'i int'e cevirir.
        >Comparator.reverseOrder() methodu sorted yapilan verileri ters cevirir.
        >sorted() methodu parantez icerisinde istenilen siralama methoduna gore siralar.
            Comparator.comparing() yazarak istedigimiz siralamayla yazdiririz
        >removeIf() methodu streamlerde degil String classinda ulasilir. Bu yuzden streamden once kullanilir
            Bir koleksiyondan belirli bir koşulu sağlayan öğeleri kaldırmak için kullanılan bir methoddur
        >IntStream --> integer'lari yukaridan asagiya dizer. Ama hangi araligi istedigini vermemiz gerekiyor. kisacasi
            integer'lardan bir stream olusturuyor
        >Bize bir list verilmediginde ve baslangic bitis degerleri verildiginde rangeClosed() methodu kullanarak
            IntStream olusturabiliriz
        >getAsInt() optional dan kurtulmak icin kullaniriz
        >

         */

        List<Integer> nums = new ArrayList<Integer>();
        nums.add(12);
        nums.add(9);
        nums.add(131);
        nums.add(14);
        nums.add(9);
        nums.add(10);
        nums.add(4);
        nums.add(12);
        nums.add(15);

        //1) Bir list'teki elemanlari ayni satirda aralarina bosluk koyarak yazdiran
        // method'u olusturunuz.(Structured == Yapisal)

        printElements(nums);//12 9 131 14 9 10 4 12 15

        printElements2(nums);//12 9 131 14 9 10 4 12 15

        printEvenElement(nums);//12 14 10 4 12

        printEvenElement2(nums);//12 14 10 4 12

        printSquareOfOddElements(nums);//81 17161 81 225

        printCubeOfDistinctOddElements(nums);//729 2248091 3375

        printSumOfSquaresOfDistinctEvenElements(nums);//456

        printProductOfSquaresOfDistinctEvenElements(nums);//45158400

        getMaxValue1(nums);//131
        getMaxValue2(nums);//131
        getMaxValue3(nums);//131
        getMaxValue4(nums);//131

        getMinValue(nums);//4
        getMinValue1(nums);//4
        getMinValue2(nums);//4
        getMinValue3(nums);//4
        getMinValue4(nums);//4

        getMinGreaterThanSevenEven(nums);//10
    }

    public static void printElements(List<Integer> nums) {

        for (Integer w : nums) {
            System.out.print(w + " ");
        }
        System.out.println();

    }

    //2) Bir list'teki elemanlari ayni satirda aralarina bosluk koyarak yazdiran
    // method'u olusturunuz.(Functional)

    public static void printElements2(List<Integer> nums) {
        nums.stream().forEach(t -> System.out.print(t + " "));//stream akis demek. t-> t icin sunu yap demek
        System.out.println();

    }

    //3) Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak yazdiran methodu olusturunuz(Structured)

    public static void printEvenElement(List<Integer> nums) {
        for (Integer w : nums) {
            if (w % 2 == 0) {
                System.out.print(w + " ");
            }
        }
        System.out.println();
    }

    //4) Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak yazdiran methodu olusturunuz(Functional)

    public static void printEvenElement2(List<Integer> nums) {

        nums.
                stream().
                filter(t -> t % 2 == 0).
                forEach(t -> System.out.print(t + " "));
        System.out.println();
    }

    //5) Bir list'teki "tek sayi" olan elemanlarin "kare"lerini ayni satirda  aralarina bosluk
    //   koyarak yazdiran method'u olusturunuz.(Functional)

    public static void printSquareOfOddElements(List<Integer> nums) {

        nums.stream().
                filter(t -> t % 2 != 0).
                map(t -> t * t).
                forEach(t -> System.out.print(t + " "));
        System.out.println();
    }

    //6) Bir list'teki "tek sayi" olan elemanlarin "kup"lerini "tekrarsiz" olarak ayni satirda aralarina bosluk
    // koyarak yazdiran method'u olusturunuz.(Functional)

    public static void printCubeOfDistinctOddElements(List<Integer> nums) {

        nums.stream().
                filter(t -> t % 2 != 0).
                distinct().
                map(t -> t * t * t).
                forEach(t -> System.out.print(t + " "));
        System.out.println();

    }

    //7)Bir list'teki "tekrarsiz" "CIFT "
    // ELEMANLARIN "karelerinin" "toplamını" hesaplayan method oluşturun

    public static void printSumOfSquaresOfDistinctEvenElements(List<Integer> nums) {

        Integer sum =
                nums.
                        stream().
                        distinct().
                        filter(t -> t % 2 == 0).
                        map(t -> t * t).
                        reduce(0, (t, u) -> t + u);
        System.out.println(sum);
    }

    //8) Bir list'teki "Tekrarsiz" elemanlardan "çift" olanlarin "karesinin"
    // "çarpımını" hesaplayan bir method oluşturun

    public static void printProductOfSquaresOfDistinctEvenElements(List<Integer> nums) {

        Integer product =
                nums.
                        stream().
                        distinct().
                        filter(t -> t % 2 == 0).
                        map(t -> t * t).
                        reduce(1, (t, u) -> t * u);
        System.out.println(product);
    }

    //9) Verilen List'teki "maksimum degeri" bulmak icin bir method olusturun
    //1.  yol ==> best practice, javayi yormuyoruz

    public static void getMaxValue1(List<Integer> nums) {
        Integer maxNum =
                nums.
                        stream().
                        distinct().
                        reduce(Integer.MIN_VALUE, (t, u) -> t > u ? t : u);
        System.out.println(maxNum);
    }

    //2.  yol
    public static void getMaxValue2(List<Integer> nums) {
        Integer max =
                nums.
                        stream().
                        distinct().
                        reduce(nums.get(0), (t, u) -> t > u ? t : u);
        System.out.println(max);
    }

    //3.  yol
    public static void getMaxValue3(List<Integer> nums) {

        int max =
                nums.
                        stream().
                        distinct().
                        sorted().
                        reduce((t, u) -> u).get();
        System.out.println(max);
    }

    //4. yol: BEST PRACTICE
    public static void getMaxValue4(List<Integer> nums) {

        int max =
                nums.
                        stream().
                        distinct().
                        sorted().
                        reduce(Math::max).
                        get();//Method referans Math::max deniyor
        System.out.println(max);
    }


    //10) Verilen List'teki "minimum degeri" bulmak icin bir method olusturun
    public static void getMinValue(List<Integer> nums) {

        int min =
                nums.
                        stream().
                        distinct().
                        sorted().
                        reduce(Math::min).
                        get();
        System.out.println(min);
    }

    //1yol
    public static void getMinValue1(List<Integer> nums) {
        Integer min = nums.stream().distinct().reduce((t, u) -> t>u ? u : t).get();
        System.out.println(min);
    }
    //2yol
    public static void getMinValue2(List<Integer> nums) {
        Integer min = nums.stream().distinct().sorted(Comparator.reverseOrder()).reduce((t, u)->u).get();
        System.out.println(min);

    }
    //3yol
    public static void getMinValue3(List<Integer> nums) {
        Integer min = nums.stream().distinct().sorted().reduce((t,u)->t).get();
        System.out.println(min);
    }
    //4.yol
    public static void getMinValue4(List<Integer> nums) {
        Integer min = nums.stream().distinct().reduce((t,u)->Math.min(t,u)).get();
        System.out.println(min);
    }

    //11)Verilen List'ten 7 den buyuk en kucuk cift sayi yi bulmak için bir method oluşturun

    public static void getMinGreaterThanSevenEven(List<Integer> nums){
        Integer min =
                nums.
                        stream().
                        filter(t-> t>7 && t%2 == 0).
                        sorted().
                        reduce((t,u) -> t).
                        get();
        System.out.println(min);
    }

}