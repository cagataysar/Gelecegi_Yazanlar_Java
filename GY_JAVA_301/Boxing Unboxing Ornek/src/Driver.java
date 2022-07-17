public class Driver {

    public static int passInteger(Integer x) {
        return x.intValue();
    }

    public static void main(String[] args) {
        int i = 10;
        int passInteger = passInteger(i);

        Double d = 10.0;
        double x = d;
    }
}
