public class Kare {

    private int x;
    private int y;
    private int uzunluk;

    public int getX() {
        return x;

    }

    public void setX(int _x) {
        if (_x >= 0) {
            x = _x;
        } else {
            System.out.println("x -1'den büyük olmalıdır.");
        }
    }

    public int getY() {
        return y;
    }

    public void setY(int _y) {
        if (_y >= 0) {
            y = _y;
        } else {
            System.out.println("y -1'den büyük olmalıdır.");
        }
    }

    public int getUzunluk() {
        return uzunluk;
    }

    public void setUzunluk(int _uzunluk) {
        if (_uzunluk >= 0) {
            uzunluk = _uzunluk;
        } else {
            System.out.println("Uzunluk -1'den büyük olmalıdır.");
        }
    }

    public void ekranaBastır() {
        System.out.println("x : " + x);
        System.out.println("y : " + y);
        System.out.println("Uzunluk : " + uzunluk);
    }
}
