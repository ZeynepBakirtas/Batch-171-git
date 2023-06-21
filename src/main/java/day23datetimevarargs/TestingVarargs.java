package day23datetimevarargs;

import com.sun.jdi.Value;

import static day02datatypesmethodcreation.MethodCreation01.toplamaYap;

public class TestingVarargs {
    public static void main(String[] args) {

        //toplama islemi yapan method olusturunuz?
        toplamaYap(4,6);

        //Example 2: Verilen isimlerin ilk harflerini console a yazdiran methodu olusturunuz?
        //      Ali Can ==> AC

        printFirstLetter("Ali Can", "Mere Gul");

    }
    public static void toplamaYap (int... a){
        int toplam =0;
        for (int w: a){
            toplam += w;
        }
        System.out.println(toplam);//10
    }

    public static void printFirstLetter (String... a){

        String chr = "";
        for (String w: a){
            chr = String.valueOf(w.charAt(0)) + w.split(" ")[1].charAt(0);
            System.out.println(chr);
            chr = "";
        }
    }

}
