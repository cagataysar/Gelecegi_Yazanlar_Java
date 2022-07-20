import java.io.Serializable;

public class Ogrenci implements Serializable {

    private int no;
    private String isim;
    private int yas;

    public Ogrenci() {

    }
    public Ogrenci(int no, String isim, int yas) {
        this.no = no;
        this.isim = isim;
        this.yas = yas;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    @Override
    public int hashCode() {
        return no;
    }

    @Override
    public boolean equals(Object obj) {
        Ogrenci ogrenci = (Ogrenci) obj;
        return ogrenci.no == this.no;
    }

    @Override
    public String toString() {
        return "Numara: " + no + ", İsim: " + isim + ", Yaş: " + yas;
    }
}




















