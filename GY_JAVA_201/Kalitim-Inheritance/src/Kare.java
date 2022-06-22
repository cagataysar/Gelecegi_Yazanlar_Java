public class Kare extends Sekil{ // Subclass

    private int kenarUzunlugu;

    public int getKenarUzunlugu() {
        return kenarUzunlugu;
    }

    public void setKenarUzunlugu(int uzunluk) {
        kenarUzunlugu = uzunluk;
    }

    public void alanHesapla() {
        System.out.println("Karenin Alanı : " + (kenarUzunlugu * kenarUzunlugu));
    }

}
