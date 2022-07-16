import java.util.ArrayList;

public class FilmDriver {

    public static void main(String[] args) {
        ArrayList<Film> arrayList = new ArrayList<>();
        arrayList.add(new Film("Apocalipse Now", "Coppola", FilmTuru.BELGESEL, 1980));
        arrayList.add(new Film("Godfather", "Coppola", FilmTuru.DRAM, 1960));
        arrayList.add(new Film("Pulp Fiction", "Tarantino", FilmTuru.KOMEDI, 1995));

        for (int i = 0; i < arrayList.size(); i++) {
            Film film = arrayList.get(i);
            System.out.println(film );
        }
    }
}
