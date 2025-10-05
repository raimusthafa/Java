import java.util.Scanner;

public class nilai_huruf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Program Konversi Nilai Huruf ===");
        System.out.print("Masukkan nilai huruf (A sampai E): ");
        String nilai = input.nextLine();

        String keterangan;

        switch (nilai) {
            case "A":
                keterangan = "Sangat Baik";
                break;
            case "B":
                keterangan = "Baik";
                break;
            case "C":
                keterangan = "Cukup";
                break;
            case "D":
                keterangan = "Kurang";
                break;
            case "E":
                keterangan = "Sangat Kurang";
                break;
            default:
                keterangan = "Nilai huruf tidak valid!";
                break;
        }

        System.out.println("Keterangan: " + keterangan);

        input.close();
    }
}
