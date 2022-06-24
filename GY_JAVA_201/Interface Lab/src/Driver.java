public class Driver {

    public static void main(String[] args) {

        Elma[] elmalar = new Elma[10];
        elmalar[0] = new Elma(10, "Sarı");
        elmalar[1] = new Elma(25, "Yeşil");
        elmalar[2] = new Elma(45, "Kırmızı");
        elmalar[3] = new Elma(100, "Sarı");
        elmalar[4] = new Elma(90, "Yeşil");
        elmalar[5] = new Elma(70, "Beyaz");
        elmalar[6] = new Elma(65, "Sarı");
        elmalar[7] = new Elma(50, "Kırmızı");
        elmalar[8] = new Elma(35, "Yeşil");
        elmalar[9] = new Elma(10, "Sarı");

        /*renkFiltrele("Sarı", elmalar);
        System.out.println("--------------------");
        agirlikFiltrele(50, elmalar);
        System.out.println("---------------");
        agirlikFiltrele2(50, elmalar);*/

        RenkFiltresi renkFiltresi = new RenkFiltresi();
        filtrele(renkFiltresi, elmalar);
    }

    public static void filtrele(ElmaFiltresi elmaFiltresi, Elma[] elmalar) {
        for (int i = 0; i < elmalar.length; i++) {
            Elma elma = elmalar[i];
            if (elmaFiltresi.filtrele(elma)) {
                System.out.println(elma.getAgirlik()+ " " + elma.getRenk());
            }
        }
    }

    public static void renkFiltrele(String renk, Elma[] elmalar) {
        for (int i = 0; i < elmalar.length; i++) {
            Elma elma = elmalar[i];
            if (elma.getRenk().equals(renk)) {
                System.out.println(elma.getRenk() + " " + elma.getAgirlik());
            }
        }
    }

    public static void agirlikFiltrele(int agirlik, Elma[] elmalar) {
        for (int i = 0; i < elmalar.length; i++) {
            Elma elma = elmalar[i];
            if (elma.getAgirlik() >= agirlik) {
                System.out.println(elma.getRenk() + " " + elma.getAgirlik());
            }
        }
    }

    public static void agirlikFiltrele2(int agirlik, Elma[] elmalar) {
        for (int i = 0; i < elmalar.length; i++) {
            Elma elma = elmalar[i];
            if (elma.getAgirlik() < agirlik) {
                System.out.println(elma.getRenk() + " " + elma.getAgirlik());
            }
        }
    }
}
