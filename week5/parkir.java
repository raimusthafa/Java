
import java.util.Scanner;


public class parkir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jenis kendaraan: ");
        String jenis = input.nextLine();

        System.out.print("Masukkan lama parkir (jam): ");
        int jam = input.nextInt();

        int biaya = 0;
        String denda = " ";

        if (jenis.equalsIgnoreCase("motor")) {
            if (jam <= 0) {
                biaya = 0;
            } else if (jam == 1) {
                biaya = 3000;
            } else if (jam > 1 && jam <= 24) {
                biaya = 30000 + 3000 + (jam - 1) * 2000;
            } else if (jam > 24) {
                biaya = 30000 + 3000 + (jam - 1) * 2000 + ((jam - 24) / 24) * 30000;
                denda = " (termasuk denda)";
            }
        } else if (jenis.equalsIgnoreCase("mobil")) {
            if (jam <= 0) {
                biaya = 0;
            } else if (jam == 1) {
                biaya = 5000;
            } else if (jam > 1 && jam <= 24) {
                biaya = 5000 + (jam - 1) * 3000;
            } else if (jam > 24) {
                biaya = 50000 + 5000 + (jam - 1) * 3000;
                denda = " (termasuk denda)"; 
            }
        } else {
            System.out.print("Input tidak valid!");
            return;
        }
        
        System.out.print("Total biaya parkir: Rp" + biaya + denda);

    }
}