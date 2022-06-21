public class Telefon {

    TelefonTipi tip;
    String marka;
    String model;
    boolean wifi;
    boolean mobilVeri;
    boolean isArama;

    void aramaYap(String telefonNo) {
        System.out.println(telefonNo);
        isArama = true;

    }

    void aramayıSonlandır() {
        if (isArama) {
            System.out.println("Arama sonlandırıldı");
        }
    }

    void mesajGonder(String mesaj) {
        if (mobilVeri || wifi) {
            System.out.println("Mesaj gönderildi");
        }
    }



}
