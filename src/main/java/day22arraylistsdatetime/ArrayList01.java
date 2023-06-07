package day22arraylistsdatetime;

import java.util.List;

public class ArrayList01 {
    public static void main(String[] args) {
        //Ornek 1: Bir listteki tekrarsiz elemanlari console a yazdiran kodu yaziniz

        List<Double> prices = List.of(2.5, 1.25, 3.75, 1.25, 4.0);

        int i = 0;

        for (double w: prices) {
            if (prices.indexOf(w) == prices.lastIndexOf(w)){
                System.out.println(w);
            }
        }

        //Ornek 2: Bir listte tekrarli eleman olup olmadigini gosteren kodu yaziniz
        List<Integer> heights = List.of(3,13,23);
        int counter = 0;
        for (Integer w: heights){
            if (heights.indexOf(w) != heights.lastIndexOf(w)){
                counter++;
            }
        }

        if(counter == 0){
            System.out.println("All elements are unique in the list");//Listedeki tum ogeler benzersizdir.
        } else {
            System.out.println("At least one element is not unique in the list");
        }
    }
}
