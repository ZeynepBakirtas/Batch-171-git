package day30maps;

import java.util.HashMap;

public class Homework {
    /*
        Home work:
        Verilen bir String'de hangi harfin kac defa kullanildigini veren method olusturunuz.
        "Hello Henry!" ==> H=2, e=2, l=2, o=1, n=1, r=1, y=1
         */
    public static void main(String[] args) {
        String sentence = "Hello Henry!";
        sentence = sentence.replaceAll("[^a-zA-Z]", "");
        String chr [] = sentence.split("");

        HashMap<String, Integer> chrMap = new HashMap<>();

        for (String w: chr){
            Integer num = chrMap.get(w);

            if (num == null){
                chrMap.put(w, 1);
            } else {
                chrMap.replace(w, num+1);
            }
        }

        System.out.println(chrMap);//{r=1, e=2, H=2, y=1, l=2, n=1, o=1}

    }
}
