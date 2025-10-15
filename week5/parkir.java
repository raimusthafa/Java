
import java.util.Scanner;


public class parkir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jenis kendaraan: ");
        String jenis = input.nextLine();

        System.out.print("Masukkan lama parkir (jam): ");
        int jam = input.nextInt();

        int biaya = 0;

        if (jenis.equalsIgnoreCase("motor")) {
            if (jam <= 0) {
                biaya = 0;
            } else if (jam == 1) {
                biaya = 3000;
            } else {
                biaya = 3000 + (jam - 1) * 2000;
            }
        } else if (jenis.equalsIgnoreCase("mobil")) {
            if (jam <= 0) {
                biaya = 0;
            } else if (jam == 1) {
                biaya = 5000;
            } else {
                biaya = 5000 + (jam - 1) * 3000;
            }
        } else {
            System.out.print("Input tidak valid!");
            return;
        }
        
        System.out.print("Total biaya parkir: Rp" + biaya);

    }
}