import java.util.Scanner;

public class kasir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0;
        String namaBarang;

        while (true) {
            System.out.print("Masukkan nama barang (atau 'selesai' untuk keluar): ");
            namaBarang = input.nextLine();

            if (namaBarang.equalsIgnoreCase("selesai")) {
                break;
            }

            System.out.print("Masukkan harga barang: Rp ");
            double harga = input.nextDouble();
            input.nextLine(); // clear buffer

            total += harga;
        }

        System.out.println("\nTotal belanja Anda: Rp " + total);
        System.out.println("Terima kasih sudah berbelanja!");
    }
}
