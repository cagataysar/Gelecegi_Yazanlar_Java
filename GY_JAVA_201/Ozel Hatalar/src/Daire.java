public class Daire {

    private int x;
    private int y;
    private double r;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        if (r < 0) {
            throw new HataliYaricap(r);
        }
        this.r = r;
    }

    @Override
    public String toString() {
        return "x: " + x + ", y: " + y +", Yarıçap: " + r;
    }
}
