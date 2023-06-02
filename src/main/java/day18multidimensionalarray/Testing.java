package day18multidimensionalarray;

import java.util.Arrays;

public class Testing {
    public static void main(String[] args) {
        String students[][] = {{"Ali", "Kemal"}, {"Cemal"}, {"Ayhan", "Beyhan", "Seyhan"}, {"Ceyhan", "Kayhan"}};
        //Ornek 1: Yukaridaki student arrayinde toplam kac tane isim oldugunu bulunuz

        int numStudents = 0;
        for (String[] w : students) {
            numStudents += w.length;
        }

        System.out.println("numStudents = " + numStudents);

        //Ornek 1: Yukaridaki students array inde icinde "m" harfi olan isimleri konsola yazdiriniz?

        for (String[] w : students) {
            for (String k : w) {
                if (k.contains("m")) {
                    System.out.print(k + " ");
                }
            }
        }
        System.out.println();

        //0rnek 2: Bir integer multidimensional array olusturunuz, tum elemanlarin carpimini hesaplayiniz
        int nums[][] = {{5, 4}, {2, 3, 2}, {7}};
        int result = 1;

        for (int[] w : nums) {
            for (int k : w) {
                result *= k;
            }
        }
        System.out.println("result = " + result);

        //Ornek : Iki boyutlu bir array i tek boyutlu bir array e ceviriniz?
        int numbers[][] = {{5, 4}, {2, 3, 2}};//==> {5,4,2,3,2}
        int numbersLength = 0;
        for (int[] w : numbers) {
            numbersLength += w.length;
        }

        int newNumbers[] = new int[numbersLength];
        int idx = 0;

        for (int[] w : numbers) {
            for (int k : w) {
                newNumbers[idx] = k;
                idx++;
            }
        }
        System.out.println("Tek boyutlu array: " + Arrays.toString(newNumbers));//[5, 4, 2, 3, 2]

        //Ornek: Bir integer multidimensional array deki en kucuk ve en buyuk elemanin toplamini bulunuz
        int ages[][] = {{15, 4}, {12, 43, 21}};//==> 4 + 43= 47

        int min = ages[0][0];
        int max = ages[0][0];

        //for (int[] w : ages) {
        //    for (int k : w) {
        //        if (min > k) {
        //            min = k;
        //        } else if (max < k) {
        //            max = k;
        //        }
        //    }
        //}
        for (int[] w : ages) {
            for (int k : w) {
                min = Math.min(min, k);
                max = Math.max(max, k);
            }
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }
}
