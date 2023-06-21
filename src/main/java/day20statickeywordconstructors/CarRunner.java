package day20statickeywordconstructors;

public class CarRunner {

    //Siz kendi constructor'inizi olusturdugunuzda java default constructor i siler
    public static void main(String[] args) {
        Car c1 = new Car("BMW","M4",2023,false);
        Car c2 = new Car("Audi","R8",1999, false);
        Car c3 = new Car("Honda", "Civic",1999, false);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        Car c4 = new Car("Mercedes", "C3000");
        System.out.println(c4);//Car{make='Mercedes', model='C3000', year=2023, hybrid=true}

    }
}
