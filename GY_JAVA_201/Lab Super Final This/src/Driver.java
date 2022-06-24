public class Driver {

    public static void main(String[] args) {

        Arac arac = new Arac("34 TT 1234", "X MARKA");
        arac.yazdir();
        System.out.println("");

        Araba araba = new Araba("01 AA 9876", "Y MARKA", 4,5);
        araba.yazdir();

    }
}
