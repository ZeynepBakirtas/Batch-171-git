package day25inheritance;

public class Honda extends Car{
    public Honda () {
        super();
        System.out.println("Honda 1");
        System.out.println("this.model = " + this.model);
        System.out.println("super.km = " + super.km);
        System.out.println("this.km = " + this.km);
        System.out.println("super.model = " + super.model);
    }
    public Honda (String model, int year) {
        super();//Superi parametresiz kullanacaksaniz yazmayabilirsiniz
        System.out.println("Honda 2");
    }

    public String model = "Civic";
    public int km = 1000;

}
