package day28interfacecollections;

public interface Engine {
    void run();
    int price = 3000;
    default void eco(){//default access modifier degildir
        System.out.println("Uses gas less");
    }
    static void stop(){
        System.out.println("Stop securely");
    }
}
