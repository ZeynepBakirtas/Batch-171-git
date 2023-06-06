package day19passbyvaluemethodoverloading;

public class PassByValue02 {
    public static void main(String[] args) {
        String name = "Tom Hanks";
        System.out.println(addTitle("Dr.", name));//Dr. Tom Hanks
        System.out.println(name);//Tom Hanks
    }
    public static String addTitle(String title, String name){
        name = title +" "+ name;
        return name;
    }
//Pass by reference orjinal degerde degisiyor.
}
