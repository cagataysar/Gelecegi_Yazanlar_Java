public class Driver {
    public static void main(String[] args) {
        byte b; //Bellekte 1 Byte yer kaplar.
        b = 10;
        System.out.println(b);
        short s = 20; // 2 Byte
        System.out.println(s);
        int i = 30; // 4 Byte
        System.out.println(i);
        long l = 40; // 8 Byte yer kaplamaktadır.
        System.out.println(l);

        float pi = 3.14f; // Bellekte 4 Byte yer kaplamaktadır.
        System.out.println(pi);
        double d = 23.2342525; // 8 Byte
        System.out.println(d);

        char c = 'a'; // 2 Byte
        System.out.println(c);

        boolean bool = true; // 1 Byte
        System.out.println(bool);

    }
}
