import java.util.Scanner;

public class miltokm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input jumlah mil
        System.out.print("Masukkan jumlah mil: ");
        double mil = input.nextDouble();

        // Konversi ke kilometer
        double kilometer = mil * 1.6;

        // Tampilkan hasil
        // System.out.println(mil + " mil sama dengan " + kilometer + " kilometer");
        System.out.printf("%.0f mil sama dengan %.1f kilometer%n", mil, kilometer);
        // System.out.printf("sama dengan %.1f kilometer%n", mil, kilometer);
    }
}
