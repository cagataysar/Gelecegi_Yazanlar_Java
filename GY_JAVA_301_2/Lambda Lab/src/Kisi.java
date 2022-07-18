import java.io.Serializable;
import java.time.LocalDate;

public class Kisi implements Serializable {

    public enum Cinsiyet {
        ERKEK, KADIN
    }

    private String isim;
    private LocalDate dogumTarihi;
    private String emailAdresi;
    private Cinsiyet cinsiyet;

    public Kisi() {

    }

    public int getYas() {
        return LocalDate.now().getYear() - dogumTarihi.getYear();
    }

    public Kisi(String isim, LocalDate dogumTarihi, String emailAdresi, Cinsiyet cinsiyet) {
        this.isim = isim;
        this.dogumTarihi = dogumTarihi;
        this.cinsiyet = cinsiyet;
        this.emailAdresi = emailAdresi;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public LocalDate getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(LocalDate dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }

    public String getEmailAdresi() {
        return emailAdresi;
    }

    public void setEmailAdresi(String emailAdresi) {
        this.emailAdresi = emailAdresi;
    }

    public Cinsiyet getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(Cinsiyet cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    @Override
    public int hashCode() {
        return emailAdresi.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        Kisi kisi = (Kisi) obj;
        return this.emailAdresi.equals(kisi.emailAdresi);
    }

    @Override
    public String toString() {
        return "İsim: " + isim + ", Doğum Tarihi: " + dogumTarihi + ", Email: " + emailAdresi + ", Cinsiyet: " + cinsiyet + ", Yaş: " + getYas();
    }
}

