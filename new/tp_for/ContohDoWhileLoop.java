import java.util.Scanner;

public class ContohDoWhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Contoh 1: Do-While loop sederhana - mencetak angka 1-10
        System.out.println("=== Contoh 1: Mencetak angka 1-10 ===");
        int i = 1;
        do {
            System.out.println("Angka: " + i);
            i++;
        } while(i <= 10);
        
        // Contoh 2: Do-While dengan kondisi awal false (tetap dijalankan 1x)
        System.out.println("\n=== Contoh 2: Kondisi awal false ===");
        int j = 100;
        do {
            System.out.println("Ini akan tercetak meskipun j = " + j + " (lebih dari 10)");
            j++;
        } while(j <= 10);
        System.out.println("Loop berhenti setelah 1 iterasi");
        
        // Contoh 3: Menu dengan validasi input
        System.out.println("\n=== Contoh 3: Menu Pilihan ===");
        int pilihan;
        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Pilihan 1");
            System.out.println("2. Pilihan 2");
            System.out.println("3. Pilihan 3");
            System.out.println("0. Keluar");
            System.out.print("Masukkan pilihan: ");
            pilihan = input.nextInt();
            
            if(pilihan == 1) {
                System.out.println("Anda memilih Pilihan 1");
            } else if(pilihan == 2) {
                System.out.println("Anda memilih Pilihan 2");
            } else if(pilihan == 3) {
                System.out.println("Anda memilih Pilihan 3");
            } else if(pilihan != 0) {
                System.out.println("Pilihan tidak valid!");
            }
        } while(pilihan != 0);
        System.out.println("Terima kasih!");
        
        // Contoh 4: Validasi input angka positif
        System.out.println("\n=== Contoh 4: Validasi Input ===");
        int angka;
        do {
            System.out.print("Masukkan angka positif (1-100): ");
            angka = input.nextInt();
            if(angka < 1 || angka > 100) {
                System.out.println("Input tidak valid! Coba lagi.");
            }
        } while(angka < 1 || angka > 100);
        System.out.println("Angka yang valid: " + angka);
        
        // Contoh 5: Tebak angka
        System.out.println("\n=== Contoh 5: Game Tebak Angka ===");
        int targetAngka = 42;
        int tebakan;
        int percobaan = 0;
        
        do {
            System.out.print("Tebak angka (1-100): ");
            tebakan = input.nextInt();
            percobaan++;
            
            if(tebakan < targetAngka) {
                System.out.println("Terlalu kecil!");
            } else if(tebakan > targetAngka) {
                System.out.println("Terlalu besar!");
            } else {
                System.out.println("Benar! Anda berhasil dalam " + percobaan + " percobaan");
            }
        } while(tebakan != targetAngka);
    }
}
