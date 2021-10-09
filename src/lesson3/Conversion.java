package lesson3;

public class Conversion {
    public static void main(String[] args) {
        byte b;
        int i = 257;
        double d = 323.142;
        i = (int) d;
        System.out.println("d i " + d + " " + i);
        b = (byte) d;
        System.out.println("d b " + d + " " + b);
    }
}
