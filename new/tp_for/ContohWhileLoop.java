import java.util.Scanner;

public class ContohWhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Contoh 1: While loop sederhana - mencetak angka 1-10
        System.out.println("=== Contoh 1: Mencetak angka 1-10 ===");
        int i = 1;
        while(i <= 10) {
            System.out.println("Angka: " + i);
            i++;
        }
        
        // Contoh 2: While loop dengan kondisi tertentu
        System.out.println("\n=== Contoh 2: Mencetak angka ganjil 1-20 ===");
        int j = 1;
        while(j <= 20) {
            if(j % 2 != 0) {
                System.out.println("Angka ganjil: " + j);
            }
            j++;
        }
        
        // Contoh 3: While loop dengan input user sampai kondisi terpenuhi
        System.out.println("\n=== Contoh 3: Input angka sampai angka negatif ===");
        int angka = 0;
        while(angka >= 0) {
            System.out.print("Masukkan angka (negatif untuk berhenti): ");
            angka = input.nextInt();
            if(angka >= 0) {
                System.out.println("Anda memasukkan: " + angka);
            }
        }
        System.out.println("Program berhenti karena input negatif");
        
        // Contoh 4: While loop untuk menghitung total
        System.out.print("\nBerapa kali ingin memasukkan angka? ");
        int jumlah = input.nextInt();
        int count = 0;
        int total = 0;
        
        System.out.println("\n=== Contoh 4: Menghitung total dari " + jumlah + " angka ===");
        while(count < jumlah) {
            System.out.print("Masukkan angka ke-" + (count + 1) + ": ");
            int nilai = input.nextInt();
            total += nilai;
            count++;
        }
        System.out.println("Total: " + total);
        System.out.println("Rata-rata: " + (double)total / jumlah);
    }
}
