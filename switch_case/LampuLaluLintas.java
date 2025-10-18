import java.util.Scanner;

public class LampuLaluLintas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String warna;
        boolean valid = false;

        System.out.println("=== Simulasi Lampu Lalu Lintas ===");

        while (!valid) {
            System.out.print("Masukkan warna lampu (merah/kuning/hijau): ");
            warna = input.nextLine().toLowerCase();

            switch (warna) {
                case "merah":
                    System.out.println("Berhenti! Jangan lanjut.");
                    valid = true;
                    break;
                case "kuning":
                    System.out.println("Bersiap-siap, perhatikan sekitar.");
                    valid = true;
                    break;
                case "hijau":
                    System.out.println("Jalan! Tetap waspada.");
                    valid = true;
                    break;
                default:
                    System.out.println("Warna tidak dikenali. Coba lagi.");
                    break;
            }
        }

        input.close();
    }
}





