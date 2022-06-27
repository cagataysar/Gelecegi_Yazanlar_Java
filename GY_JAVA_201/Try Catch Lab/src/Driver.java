public class Driver {

    public static void main(String[] args) {

        Isci isci = new Isci();
        try {
            isci.setIsim("    ");
        } catch (HataliDeger e) {
            throw new RuntimeException(e);
        }
        try {
            isci.setMaas(2200);
        } catch (HataliDeger e) {
            System.out.println(e.getMessage());
        }

        System.out.println(isci);
    }
}
