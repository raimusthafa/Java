import java.util.Scanner;

public class kalkulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ulang;

        do {
            System.out.print("Masukkan angka pertama: ");
            double a = input.nextDouble();
            System.out.print("Masukkan angka kedua: ");
            double b = input.nextDouble();

            System.out.println("Pilih operasi (+, -, *, /): ");
            char op = input.next().charAt(0);

            double hasil = 0;
            switch (op) {
                case '+': hasil = a + b; break;
                case '-': hasil = a - b; break;
                case '*': hasil = a * b; break;
                case '/': 
                    if (b != 0) hasil = a / b; 
                    else System.out.println("Tidak bisa dibagi 0!");
                    break;
                default: System.out.println("Operasi tidak valid!");
            }

            System.out.println("Hasil: " + hasil);
            System.out.print("Hitung lagi? (y/n): ");
            ulang = input.next().charAt(0);
        } while (ulang == 'y' || ulang == 'Y');

        System.out.println("Program selesai.");
    }
}
