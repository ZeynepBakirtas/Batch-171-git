package day28interfacecollections;

public class Civic implements Ac, Security, Engine {
    @Override
    public void cool() {
        System.out.println("Civic cool super");
    }

    @Override
    public void run() {
        System.out.println("AC runs super");
    }
    //Interface






}
