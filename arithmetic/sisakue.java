import java.util.Scanner;

public class sisakue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Input jumlah kue dan jumlah anggota keluarga
        System.out.print("Masukkan jumlah kue: ");
        int kue = input.nextInt();
        System.out.print("Masukkan jumlah anggota keluarga: ");
        int anggota = input.nextInt();
        
        // Hitung sisa kue
        int sisa = kue % anggota;
        
        // Tampilkan hasil
        System.out.print("Banyak kue yang tersisa: " + sisa);
    }
}
