import java.util.Scanner;

public class Cetakboolean {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

        // Input nilai boolean
        System.out.print("Masukkan nilai boolean (true/false): ");
        boolean nilai = input.nextBoolean();

        // Cetak hasil
        System.out.print(nilai);
    }
}
