import java.util.Scanner;

public class KonversiFeetKeMeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Deklarasi variabel
        double feet, meter;
        
        // Konstanta konversi
        final double KONVERSI = 0.3048;
        
        // Input panjang dalam satuan feet
        System.out.print("Masukkan panjang dalam satuan feet: ");
        feet = input.nextDouble();
        
        // Proses konversi
        meter = feet * KONVERSI;
        
        // Output hasil konversi
        System.out.println("Panjang dalam satuan meter: " + meter);
        
        input.close();
    }
}
