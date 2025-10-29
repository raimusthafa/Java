import java.util.Scanner;

public class ContohForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Contoh 1: For loop sederhana - mencetak angka 1-10
        System.out.println("=== Contoh 1: Mencetak angka 1-10 ===");
        for(int i = 1; i <= 10; i++) {
            System.out.println("Angka: " + i);
        }
        
        // Contoh 2: For loop dengan increment 2
        System.out.println("\n=== Contoh 2: Mencetak angka genap 2-20 ===");
        for(int i = 2; i <= 20; i += 2) {
            System.out.println("Angka genap: " + i);
        }
        
        // Contoh 3: For loop menurun
        System.out.println("\n=== Contoh 3: Countdown dari 10 ke 1 ===");
        for(int i = 10; i >= 1; i--) {
            System.out.println("Countdown: " + i);
        }
        
        // Contoh 4: For loop dengan input user
        System.out.print("\nMasukkan batas perulangan: ");
        int batas = input.nextInt();
        System.out.println("\n=== Contoh 4: Perulangan dari 1 sampai " + batas + " ===");
        for(int i = 1; i <= batas; i++) {
            System.out.println("Iterasi ke-" + i);
        }
        
        // Contoh 5: Nested for loop - tabel perkalian
        System.out.println("\n=== Contoh 5: Tabel Perkalian 5x5 ===");
        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= 5; j++) {
                System.out.print((i * j) + "\t");
            }
            System.out.println();
        }
    }
}
