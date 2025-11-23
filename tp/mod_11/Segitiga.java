import java.util.Scanner;

public class Segitiga {

    // Mengecek apakah tiga sisi dapat membentuk segitiga
    public static boolean segitigaSah(double a, double b, double c) {
        return (a > 0 && b > 0 && c > 0) &&
               (a + b > c && a + c > b && b + c > a);
    }

    // Segitiga sama sisi
    public static boolean segitigaSamaSisi(double a, double b, double c) {
        return segitigaSah(a, b, c) && a == b && b == c;
    }

    // Segitiga sama kaki
    public static boolean segitigaSamaKaki(double a, double b, double c) {
        return segitigaSah(a, b, c) &&
              (a == b || a == c || b == c);
    }

    // Segitiga siku-siku
    public static boolean segitigaSiku(double a, double b, double c) {
        if (!segitigaSah(a, b, c)) return false;

        double x = a*a, y = b*b, z = c*c;
        return x + y == z || x + z == y || y + z == x;
    }

    // MAIN PROGRAM
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        // System.out.println("Segitiga sah: " + segitigaSah(a, b, c));
        System.out.println("Segitiga sama sisi: " 
        + segitigaSamaSisi(a, b, c));
        System.out.println("Segitiga sama kaki: " 
        + segitigaSamaKaki(a, b, c));
        System.out.println("Segitiga siku-siku: " 
        + segitigaSiku(a, b, c));
    }
}
