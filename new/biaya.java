import java.util.Scanner;

public class biaya {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final double biaya_awal = 10000000; // Rp 10.000.000
        final double kenaikan = 0.06; // 6% per tahun

        System.out.print("Masukkan tahun: ");
        int tahun = input.nextInt();

        double biaya = biaya_awal;

        if (tahun < 1) {
            System.out.println("Tahun harus lebih dari 0!");
        } else {
            for (int i = 2; i <= tahun; i++) {
                biaya += biaya * kenaikan;
            }
            System.out.printf("Biaya kuliah pada tahun ke-%d adalah: Rp %.0f%n", tahun, biaya);
        }

        input.close();
    }
}
