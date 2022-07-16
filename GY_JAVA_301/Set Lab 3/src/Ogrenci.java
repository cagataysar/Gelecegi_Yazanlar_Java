public class Ogrenci implements Comparable<Ogrenci>{

    private int no;
    private String ad;
    private String soyad;
    private String sinif;

    public Ogrenci() {

    }
    public Ogrenci(int no, String ad, String soyad, String sinif) {
        this.no = no;
        this.ad = ad;
        this.soyad = soyad;
        this.sinif = sinif;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getSinif() {
        return sinif;
    }

    public void setSinif(String sinif) {
        this.sinif = sinif;
    }

    @Override
    public boolean equals(Object obj) {
        Ogrenci ogrenci = (Ogrenci) obj;
        return ogrenci.no == this.no;
    }

    @Override
    public int hashCode() {
        return this.no;
    }

    @Override
    public String toString() {
        return "Numara: " + no + ", Ad: " + ad + ", Soyad: " + soyad + ", Sınıf: " + sinif;
    }

    @Override
    public int compareTo(Ogrenci o) {
        return this.no - o.no;
    }
}
