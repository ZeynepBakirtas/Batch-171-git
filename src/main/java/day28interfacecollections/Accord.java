package day28interfacecollections;

public class Accord implements Ac, Security, Engine{
    @Override
    public void cool() {
        System.out.println("Accord cool super");
    }

    @Override
    public void run() {
        System.out.println("Engine runs super");
    }
}
