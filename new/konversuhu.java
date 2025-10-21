import java.util.Scanner;

public class konversuhu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== KONVERSI SUHU ===");
            System.out.println("1. Celcius ke Fahrenheit");
            System.out.println("2. Fahrenheit ke Celcius");
            System.out.println("3. Keluar");
            System.out.print("Pilih: ");
            pilihan = input.nextInt();

            if (pilihan == 1) {
                System.out.print("Masukkan suhu (°C): ");
                double c = input.nextDouble();
                double f = (c * 9 / 5) + 32;
                System.out.println("Hasil: " + f + " °F");
            } else if (pilihan == 2) {
                System.out.print("Masukkan suhu (°F): ");
                double f = input.nextDouble();
                double c = (f - 32) * 5 / 9;
                System.out.println("Hasil: " + c + " °C");
            } else if (pilihan == 3) {
                System.out.println("Keluar dari program.");
            } else {
                System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 3);
    }
}
