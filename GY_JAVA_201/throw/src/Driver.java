public class Driver {

    public static void main(String[] args) {
        int a  = 10;
        int b = 0;
        try {
            System.out.println(a/b);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            throw e;
        } finally {
            System.out.println("Program bu satıra ulaşamadı.");
        }
    }
}
