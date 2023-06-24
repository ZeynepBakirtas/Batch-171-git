package day32exceptions;

public class E02 {
    public static void main(String[] args) {

        //Birbirine donusturulemeyecek data type larini donusturmekte israr ederseniz java ClassCastException atar.
        Object obj = 70;
        try {
            String str = (String) obj;
            System.out.println(str);
        } catch (ClassCastException e) {
            //out yerine err(error) verdigimizde sout u kirmizi yazdirir. sout yerine kisa yol serr
            System.err.println("Her data type i her data type ina ceviremezsiniz");
        }

    }
}
