package day18multidimensionalarray;

import java.util.Arrays;

public class Md03 {
    public static void main(String[] args) {
        //Ornek : Iki boyutlu bir array i tek boyutlu bir array e ceviriniz?
        int numbers[][] = {{5,4},{2,3,2}};//==> {5,4,2,3,2}

        //1. step: Iki boyutlu array de kac eleman oldugunu bulan kodu yazmaliyiz
        int toplamElemanSayisi = 0;

        for (int[] w:numbers){
            toplamElemanSayisi+=w.length;
        }

        //2. step: Tek boyutlu array i iki boyutlu array in eleman sayisini kullanarak olusturmaliyiz.
        int newArr[] = new int[toplamElemanSayisi];

        //3. step: Iki boyutlu array deki elemanlari tek boyutlu array e transfer etmeliyiz.
        int idx = 0;
        for(int[] w:numbers){//outer loop ile multidimensional arrayin int array olan elemanlarini tek tek aliriz
            for (int k:w) {//inner loop ile w sepetine koymus oldugumuz arrayin elemanlarini tek tek aliriz
                newArr[idx] = k;//yeni olusturdugumuz arraye index kullanarak atama yapariz
                idx++;//bir eleman ekledikten sonra bir yana kaydirma yapiyoruz
            }
        }

        System.out.println(Arrays.toString(newArr));//[5, 4, 2, 3, 2]

    }
}
