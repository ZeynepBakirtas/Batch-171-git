package day35lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Ali");
        myList.add("Elif");
        myList.add("Yusuf");
        myList.add("Elif");
        myList.add("Zeynep");
        myList.add("Mustafa");

        printElementsExceptStartsWithE(myList);
        System.out.println();
        printDistinctElLengthLessThanFive(myList);
        System.out.println();
        List<String> newList= getElementsLengthMoreThanFiveWithUpperCase(myList);
        System.out.println(newList);
        printElementLengthLessThanFiveUniqueWithLowerCase(myList);
        System.out.println();
        printElementsUniqueToUpperCaseSorted(myList);
    }

    //Example 1: Bir List'teki E ile baslayanlar haric tum elemanlari
    // console'a yazdiran method'u olusturunuz.
    public static void printElementsExceptStartsWithE( List<String> myList){
        myList.
                stream().
                filter(t->!t.startsWith("E")).
                forEach(t-> System.out.print(t+" "));
    }
    //Example 2: Bir List'te character sayisi 5 den az olan tum elemanlari
    // tekrarsiz olarak console'a yazdiran method'u olusturunuz.
    public static void printDistinctElLengthLessThanFive(List<String> myList){
        myList.
                stream().
                distinct().
                filter(t->t.length()<5).
                forEach(t-> System.out.print(t+" "));
    }
    //Example 3: Bir List'teki character sayisi 5 den cok olan tum elemanlari
    // buyuk harflerle bir listin icinde veren method'u olusturunuz.

    public static List<String> getElementsLengthMoreThanFiveWithUpperCase(List<String> myList){
        return   myList.
                stream().
                filter(t->t.length()>5).
                map(t->t.toUpperCase()).
                collect(Collectors.toList());
    }

    //tavsiye edilir
    public static List<String> getElementsLengthMoreThanFiveWithUpperCase2(List<String> myList){
        return   myList.
                stream().
                filter(t->t.length()>5).
                map(String::toUpperCase).
                collect(Collectors.toList());
    }



    //Example 4: Bir List'teki character sayisi 5 den az olan tum elemanlari tekrarsiz olarak
    // kucuk harflerle natural order da console'a yazdiran method'u olusturunuz.
    public static void printElementLengthLessThanFiveUniqueWithLowerCase(List<String> myList){
        myList.
                stream().
                distinct().
                filter(t->t.length()<5).
                map(t->t.toLowerCase()).
                sorted().
                forEach(t-> System.out.print(t+" "));
    }
    public static void printElementLengthLessThanFiveUniqueWithLowerCase2(List<String> myList){
        myList.
                stream().
                distinct().
                filter(t->t.length()<5).
                map(String::toLowerCase).
                sorted().
                forEach(Utils::printInTheSameLineWithSpace);
    }


    //Example 5: Bir List'teki elemanlari tekrarsiz olarak buyuk harflerle alfabetik sirada
    // console'a yazdiran method'u olusturunuz.
    public static void printElementsUniqueToUpperCaseSorted(List<String> myList){
        myList.
                stream().
                distinct().
                map(t->t.toUpperCase()).
                sorted().
                forEach(t-> System.out.print(t+" "));
    }

    public static void printElementsUniqueToUpperCaseSorted2(List<String> myList){
        myList.
                stream().
                distinct().
                map(String::toUpperCase).
                sorted().
                forEach(Utils::printInTheSameLineWithSpace);
    }


    //Example 6: Bir List'teki elemanlari tekrarsiz olarak kucuk harflerle uzunluklarina gore
    // kucukten buyuge siralayarak console'a yazdiran method'u olusturunuz.
    public static void printElementUniqueLowerCaseSortWithLength(List<String> myList){
        myList.
                stream().
                distinct().
                map(t->t.toLowerCase()).
                sorted(Comparator.comparing(t->t.length())).
                forEach(t-> System.out.print(t+" "));
    }
    //tavsiye edilir
    public static void printElementUniqueLowerCaseSortWithLength2(List<String> myList){
        myList.
                stream().
                distinct().
                map(String::toLowerCase).//Class Name :: method ==> method reference
                sorted(Comparator.comparing(String::length)).
                forEach(Utils::printInTheSameLineWithSpace);
    }

}