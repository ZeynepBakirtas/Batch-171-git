package day18multidimensionalarray;

public class Md02 {
    public static void main(String[] args) {
        String students[][] = {{"Ali","Kemal"},{"Cemal"},{"Ayhan","Beyhan","Seyhan"},{"Ceyhan","Kayhan"}};
        //Ornek 1: Yukaridaki students array inde icinde "m" harfi olan isimleri konsola yazdiriniz?
        
        for (String[] w:students){
            for(String k: w){
                if (k.contains("m")){
                    System.out.println(k);
                }
            }
        }

        //0rnek 2: Bir integer multidimensional array olusturunuz, tum elemanlarin carpimini hesaplayiniz
        int nums[][]={{5,4},{2,3,2},{7}};
        int result = 1;
        for (int[] w:nums){
            for(int k: w){
               result*=k;
            }
        }
        System.out.println(result);
    }
}
