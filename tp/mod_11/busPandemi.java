
import java.util.Scanner;

public class busPandemi {

    public static double persentase(int penumpang, int kapasitas) {
        return (double) penumpang / kapasitas * 100;
    }

    public static boolean berangkat(double persen) {
        return persen >= 50 && persen <= 75;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int kapasitas = sc.nextInt();
        int penumpang = sc.nextInt();

        double persen = busPandemi.persentase(penumpang, kapasitas);

        if (busPandemi.berangkat(persen)) {
            System.out.println("berangkat");
        } else {
            System.out.println("tidak berangkat");
        }
    }
}
