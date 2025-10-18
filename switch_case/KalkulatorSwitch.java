import java.util.Scanner;

public class KalkulatorSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Kalkulator Sederhana ===");
        System.out.println("Pilih operasi:");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.println("5. Modulus");
        System.out.print("Masukkan pilihan (1-5): ");
        int pilihan = input.nextInt();

        System.out.print("Masukkan bilangan pertama: ");
        double a = input.nextDouble();

        System.out.print("Masukkan bilangan kedua: ");
        double b = input.nextDouble();

        double hasil;

        switch (pilihan) {
            case 1:
                hasil = a + b;
                System.out.println("Hasil penjumlahan: " + hasil);
                break;
            case 2:
                hasil = a - b;
                System.out.println("Hasil pengurangan: " + hasil);
                break;
            case 3:
                hasil = a * b;
                System.out.println("Hasil perkalian: " + hasil);
                break;
            case 4:
                if (b != 0) {
                    hasil = a / b;
                    System.out.println("Hasil pembagian: " + hasil);
                } else {
                    System.out.println("Error: Tidak bisa membagi dengan nol!");
                }
                break;
            case 5:
                hasil = a % b;
                System.out.println("Sisa hasil bagi (modulus): " + hasil);
                break;
            default:
                System.out.println("Pilihan tidak valid!");
        }

        input.close();
    }
}
