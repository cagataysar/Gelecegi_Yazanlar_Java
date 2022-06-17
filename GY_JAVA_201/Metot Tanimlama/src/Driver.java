public class Driver {

    /*public void merhaba() {
        System.out.println("Merhaba");
    }
*/
    public static void main(String[] args) {

        /*Driver driver = new Driver();
        driver.merhaba();*/

        HesapMakinesi hesapMakinesi = new HesapMakinesi();
        float toplama = hesapMakinesi.topla(4.0f,6.0f);
        System.out.println(toplama);

        System.out.println(hesapMakinesi.cikar(6.0f,2.0f));
        System.out.println(hesapMakinesi.carp(5.0f,7.0f));
        System.out.println(hesapMakinesi.bol(9.0f,2.0f));

    }
}
