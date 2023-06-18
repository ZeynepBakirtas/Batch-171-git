package day23datetimevarargs;

public class Varargs02 {
    public static void main(String[] args) {
        //Example 2: Verilen isimlerin ilk harflerini console a yazdiran methodu olusturunuz?
        //      Ali Can ==> AC

        getInitials("Ali Can", "Kemal Han");//AC    KH
    }
    public static void getInitials(String... s){
        String initials = "";
        for (String w: s){
            initials = initials + w.charAt(0) + w.split(" ")[1].charAt(0);
            System.out.println(initials);
            initials = "";
        }
    }
}
