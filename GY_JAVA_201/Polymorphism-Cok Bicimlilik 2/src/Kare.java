public class Kare extends Sekil{

    private int kenarUzunlugu;

    public Kare(int u) {
        kenarUzunlugu = u;
    }

    public int getKenarUzunlugu() {
        return kenarUzunlugu;
    }

    public void setKenarUzunlugu(int u) {
        kenarUzunlugu = u;
    }

    public void alan() {
        System.out.println("Karenin Alanı: " + (kenarUzunlugu * kenarUzunlugu));
    }
}
