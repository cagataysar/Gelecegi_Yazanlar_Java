import java.io.Serializable;

public class Koltuk implements Serializable {

    private int no;
    private Bilet bilet;

    public Koltuk() {

    }
    public Koltuk(int no, Bilet bilet) {
        this.no = no;
        this.bilet = bilet;

    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public Bilet getBilet() {
        return bilet;
    }

    public void setBilet(Bilet bilet) {
        this.bilet = bilet;
    }

    @Override
    public int hashCode() {
        return no + bilet.getNumara();
    }

    @Override
    public boolean equals(Object obj) {
        Koltuk koltuk = (Koltuk) obj;
        return this.no == koltuk.no && this.bilet.equals(koltuk.bilet);
    }

    @Override
    public String toString() {
        return "Numara: " + no + ", Bilet: " + bilet.toString();
    }
}
