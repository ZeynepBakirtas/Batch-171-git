package day34lambda;

import java.util.ArrayList;
import java.util.List;

public class Testing {


    public static void main(String[] args) {

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

        printListOfElement(nums);//12 9 131 14 9 10 4 12 15
        System.out.println();
        pritnListOfEvenElement(nums);//12 14 10 4 12
        System.out.println();
        printSquareOfOddElements(nums);//81 17161 81 225
        System.out.println();
        printCubeDistinctOfOddElements(nums);//729 2248091 3375
        System.out.println();
        printSumOfSquaresOfDistinctEvenElements(nums);//456
        printProductOfSquaresOfDistinctEvenElements(nums);//45158400
        maxValueOfList(nums);//131
    }

    //2) Bir list'teki elemanlari ayni satirda aralarina bosluk koyarak yazdiran
    // method'u olusturunuz.(Functional)

    public static void printListOfElement (List<Integer> nums){

        nums.stream().forEach(t-> System.out.print(t + " "));
    }

    //4) Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak yazdiran methodu olusturunuz(Functional)

    public static void pritnListOfEvenElement (List<Integer> nums){

        nums.stream().filter(t-> t%2==0).forEach(t-> System.out.print(t + " "));
    }

    //5) Bir list'teki "tek sayi" olan elemanlarin "kare"lerini ayni satirda  aralarina bosluk
    //   koyarak yazdiran method'u olusturunuz.(Functional)

    public static void printSquareOfOddElements(List<Integer> nums){
        nums.stream().filter(t-> t%2 != 0).map(t-> t*t).forEach(t-> System.out.print(t + " "));
    }

    //6) Bir list'teki "tek sayi" olan elemanlarin "kup"lerini "tekrarsiz" olarak ayni satirda aralarina bosluk
    // koyarak yazdiran method'u olusturunuz.(Functional)

    public static void printCubeDistinctOfOddElements (List<Integer> nums){
        nums.stream().distinct().filter(t-> t%2!=0).map(t-> t*t*t).forEach(t-> System.out.print(t + " "));
    }

    //7)Bir list'teki "tekrarsiz" "CIFT "
    // ELEMANLARIN "karelerinin" "toplamını" hesaplayan method oluşturun

    public static void printSumOfSquaresOfDistinctEvenElements (List<Integer> nums){
        Integer sum = nums.stream().distinct().filter(t-> t%2==0).map(t-> t*t).reduce(0, (t,u) -> t+u);
        System.out.println(sum);
    }

    //8) Bir list'teki "Tekrarsiz" elemanlardan "çift" olanlarin "karesinin"
    // "çarpımını" hesaplayan bir method oluşturun

    public static void printProductOfSquaresOfDistinctEvenElements (List<Integer> nums){
        Integer product = nums.stream().distinct().filter(t-> t%2==0).map(t-> t*t).reduce(1,(t,u) -> t*u);
        System.out.println(product);
    }

    //9) Verilen List'teki "maksimum degeri" bulmak icin bir method olusturun
    //1.  yol ==> best practice, javayi yormuyoruz

    public static void maxValueOfList (List<Integer> nums){
        Integer max = nums.stream().distinct().sorted().reduce(Integer.MIN_VALUE, (t,u) -> t<u ? u : t);
        System.out.println(max);
    }
}
