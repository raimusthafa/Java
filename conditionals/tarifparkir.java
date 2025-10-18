import java.util.Scanner;

public class tarifparkir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan kendaraan: ");
        String kendaraan = input.nextLine();

        System.out.print("Masukkan lama parkir (jam):  ");
        int jam = input.nextInt();

        int biaya = 0;

        if (kendaraan.equalsIgnoreCase("motor") ) {   
            if (jam <= 0) {
                biaya = 0;
            } else if (jam == 1) {
                    biaya = 3000;
                } else {
                    biaya = 3000 + (jam - 1) * 2000;
            }
        } else if (kendaraan.equalsIgnoreCase("mobil")) {
            if (jam <= 0) {
                biaya = 0;
            } else if (jam == 1) {
                biaya = 5000;
            } else {
                biaya = 5000 + (jam - 1) * 3000;
            }
        } else {
            System.out.print("Jenis kendaraan tidak valid!");
            return;
        }

        System.out.println("Total biaya parkir: Rp" + biaya);
    }
}
