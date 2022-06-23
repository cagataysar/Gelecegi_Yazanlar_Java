public class Memur extends Calisan{

    private String birim;

    public Memur(String i, String g, int m, String b) {
        super(i, g, m);
        birim = b;
    }

    public String getBirim() {
        return birim;
    }

    public void setBirim(String b) {
        birim = b;
    }

    public void ozet() {
        System.out.println("Memur İsim: " + getIsim());
        System.out.println("Memur Görev: " +getGorev());
        System.out.println("Memur Maaş: " +getMaas());
        System.out.println("Memur Birim: " +birim);
    }
}
