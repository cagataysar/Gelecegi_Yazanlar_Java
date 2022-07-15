public class Araba {

    private String marka;
    private String model;
    private String plaka;

    public Araba() {

    }

    public Araba(String marka, String model, String plaka) {
        this.marka = marka;
        this.model = model;
        this.plaka = plaka;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPlaka() {
        return plaka;
    }

    public void setPlaka(String plaka) {
        this.plaka = plaka;
    }

    @Override
    public boolean equals(Object obj) {
        Araba araba = (Araba) obj;
        return araba.plaka.equals(this.plaka);
    }

    @Override
    public int hashCode() {
        return this.plaka.hashCode();
    }

    @Override
    public String toString() {
        return "Plaka: " + plaka + ", Model: " + model + ", Marka: " +marka;
    }
}
