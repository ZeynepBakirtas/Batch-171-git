package day29collections;

import java.util.LinkedList;
import java.util.Queue;

public class Queues01 {
    public static void main(String[] args) {

        Queue<String> depo = new LinkedList<>();
        depo.add("Milk");
        depo.add("Meat");
        depo.add("Egg");
        depo.add("Cheese");

        System.out.println(depo);//[Milk, Meat, Egg, Cheese]

        depo.remove();
        System.out.println(depo);//[Meat, Egg, Cheese]

        System.out.println(depo.peek());//Meat (copy + paste)

        System.out.println(depo.element());//Meat

        System.out.println(depo);//[Meat, Egg, Cheese]

        //Element kullanmak daha mantikli eger depo bossa null vermez. Program hata verir.

        System.out.println(depo.poll());//Meat
        System.out.println(depo);//[Egg, Cheese]

        depo.clear();
        System.out.println(depo.poll());//null
        // System.out.println(depo.remove()); exeption
        // System.out.println(depo.element()); exception
        System.out.println(depo.peek());// null

    }
}
