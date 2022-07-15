public class Calisan {

    private String tc;
    private String isim;

    public Calisan(){

    }

    public Calisan(String tc, String isim) {
        this.tc = tc;
        this.isim = isim;
    }

    public String getTc() {
        return tc;
    }

    public void setTc(String tc) {
        this.tc = tc;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    @Override
    public int hashCode() {
        return Integer.valueOf(tc);
    }

    @Override
    public boolean equals(Object other) {
        Calisan calisan = (Calisan) other;
        return this.tc.equals(calisan.tc);
    }

    @Override
    public String toString() {
        return "TC No: " + tc + ", İsim: " + isim;
    }
}
