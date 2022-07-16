import java.io.Serializable;

public class Film implements Serializable {

    private String isim;
    private String yonetmen;
    private FilmTuru tur;
    private int yil;

    public Film() {

    }

    public Film(String isim, String yonetmen, FilmTuru tur, int yil) {
        this.isim = isim;
        this.yonetmen = yonetmen;
        this.tur = tur;
        this.yil = yil;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getYonetmen() {
        return yonetmen;
    }

    public void setYonetmen(String yonetmen) {
        this.yonetmen = yonetmen;
    }

    public FilmTuru getTur() {
        return tur;
    }

    public void setTur(FilmTuru tur) {
        this.tur = tur;
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        this.yil = yil;
    }

    @Override
    public int hashCode() {
        return this.yil + this.isim.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        Film film = (Film) obj;
        return film.isim.equals(this.isim) && film.yil == this.yil;
    }

    @Override
    public String toString() {
        return "İsim: " + isim + ", Yönetmen: " + yonetmen + ", Film Türü: " + tur + ", Yıl: " + yil;
    }
}
