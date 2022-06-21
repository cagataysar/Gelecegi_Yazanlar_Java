import java.util.Date;

public class Driver {

    public static void main(String[] args) {

        Calisan calisan = new Calisan();
        calisan.setİsim("Ali");
        calisan.setMaas(1200.0);
        calisan.setİseGirisTarihi(new Date());

        System.out.println(calisan.getİsim());
        System.out.println(calisan.getMaas());
        System.out.println(calisan.getIseGirisTarihi());

    }

}
