public class Sehir implements Comparable<Sehir>{

    private String plakaKodu;
    private String isim;

    public Sehir() {

    }
    public Sehir(String plakaKodu, String isim) {
        this.isim = isim;
        this.plakaKodu = plakaKodu;
    }

    public String getPlakaKodu() {
        return plakaKodu;
    }

    public void setPlakaKodu(String plakaKodu) {
        this.plakaKodu = plakaKodu;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    @Override
    public String toString() {
        return "Plaka Kodu: " + plakaKodu + ", İsim: " + isim;
    }

    @Override
    public int compareTo(Sehir o) {
        return this.plakaKodu.compareTo(o.plakaKodu);
    }
}
