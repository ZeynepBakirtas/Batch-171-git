package day26polymorphism;

public class StudentRunner {
    public static void main(String[] args) {

        Student s1 = new Student();
        System.out.println(s1.getStdId());//AC23844859
        System.out.println(s1.getNotOrt());//3.13
        System.out.println(s1.isSuccessful());//false

        System.out.println("=================================");

        s1.setStdId("MU305703");
        s1.setSuccessful(true);
        s1.setNotOrt(4.90);
        System.out.println(s1.getStdId());//Not ortalamasi = 4.9
        System.out.println(s1.getNotOrt());
        System.out.println(s1.isSuccessful());

        System.out.println("=================================");

        s1.setStdId("VH394705");
        s1.setSuccessful(false);
        s1.setNotOrt(1.25);
        System.out.println(s1.getStdId());//Not ortalamasi = 4.9
        System.out.println(s1.getNotOrt());
        System.out.println(s1.isSuccessful());
    }
}
