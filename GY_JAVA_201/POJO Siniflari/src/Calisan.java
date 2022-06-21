import java.util.Date;

public class Calisan {

    private String isim;
    private double maas;
    private Date iseGirisTarihi;

    public void setİsim(String s) {
        isim = s;

    }

    public String getİsim() {
        return isim;
    }

    public void setMaas(double d) {
        maas = d;

    }

    public double getMaas() {
        return maas;
    }

    public void setİseGirisTarihi(Date d) {
        iseGirisTarihi = d;
    }

    public Date getIseGirisTarihi() {
        return iseGirisTarihi;
    }
}
