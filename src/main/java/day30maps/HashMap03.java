package day30maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class HashMap03 {
    public static void main(String[] args) {
        //Example 1: Verilen cumledeki kelimelerin gorunum sayisini veren kodu yaziniz.
        //"I like you, like like!"  => I=1, like=3, you=1

        String s = "I like you, like like!";
        s = s.replaceAll("\\p{Punct}", "");

        System.out.println(s);

        String words [] = s.split(" ");
        System.out.println(Arrays.toString(words));

        //words arrayindeki kelimeler birer birer map de var mi yok mu diye kontrol edecegiz
        //words arrayindeki kelimeler map de yoksa map e value su 1 olarak yerlestirilecek
        //words arrayindeki kelimeler map de varsa map e varolan value su 1 artirilarak yerlestirilecek

        HashMap<String, Integer> occ = new HashMap<>();

        for (String w: words){
            Integer numOfOccurance = occ.get(w);

            if (numOfOccurance == null){
                occ.put(w, 1);
            } else {
                occ.replace(w, numOfOccurance+1);
            }
        }

        System.out.println(occ);
    }
}
