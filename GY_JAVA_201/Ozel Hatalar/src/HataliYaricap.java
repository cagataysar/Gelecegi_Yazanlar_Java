public class HataliYaricap extends RuntimeException{

    private double r;

    public HataliYaricap(double r) {
        super("Yarıçap" + r + " olamaz!");
    }
}
