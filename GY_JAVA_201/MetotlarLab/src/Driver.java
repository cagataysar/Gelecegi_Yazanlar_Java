import java.util.Arrays;

public class Driver {

    //private static int x = 20;

    public static void main(String[] args) {
        /*Driver driver = new Driver();
        driver.normalMetot();

        Driver.staticMetot(); */

        /*boolean majority = Driver.majority(true,false,true);
        System.out.println(majority);*/

        /*int[] x = {1,2,3};
        int[] y = {1,2,3};
        System.out.println(Driver.eq(x,y));

        System.out.println(Driver.cube(2));

        int[] numbers = {2, 4, 6, 8};
        System.out.println(Driver.topla(numbers));

        int[] sonucCift = Driver.ciftSayilar(new int[] {1,2,3,4,5,6,7,8,9,0});
        System.out.println(Arrays.toString(sonucCift));*/

        int x2 = 10;
        int y2 = 20;

        System.out.println(x2 + " " + y2);
        //degistir(x2,y2);
        System.out.println(x2 + " " + y2);



    }

    /*public static void degistir(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
    }*/

    public static int[] ciftSayilar(int[] sayilar) {
        int[] sonuc = null;
        int adet = 0;
        for (int i=0; i< sayilar.length; i++) {
            if (sayilar[i] % 2 == 0) {
                adet++;
            }
        }
        sonuc = new int[adet];
        int index = 0;
        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i] % 2 == 0) {
                sonuc[index++] = sayilar[i];
            }
        }
        return sonuc;
    }

    public static int topla(int[] x) {
        int result = 0;
        for (int i=0; i < x.length; i++) {
            result += x[i];
        }
        return result;
    }

    public static int cube(int x) {
        return x * x * x;
    }

    public static boolean eq(int[] x, int[] y) {
        boolean result = true;
        if (x.length == y.length) {
            for (int i = 0; i < x.length; i++) {
                if (x[i] != y[i]) {
                    result = false;
                    break;
                }
            }
        } else {
            result = false;
        }
        return result;
    }

    /*public void normalMetot() {
        System.out.println(x);
    }

    public static void staticMetot() {
        System.out.println(x);
    }*/

    /*public static boolean majority(boolean x, boolean y, boolean z) {
        return (x && y) || (x && z) || (y && z);

    }*/
}
