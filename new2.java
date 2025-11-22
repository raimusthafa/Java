
import java.util.Scanner;

public class new2 {
    public static void main(String [] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("Masukkan jumlah bus: ");
        int jumlah = input.nextInt();

        for (int i = 1; i <= jumlah; i++) {
        System.out.println("Data bus ke-" + i);
        System.out.print("Masukkan nama bus: ");
        String nama = input.nextLine();

        System.out.print("Masukkan jumlah kapasitas: ");
        int kapasitan = input.nextInt();

        System.out.print("Kelas bus (A/B/C): ");
        char kelas = input.next().toUpperCase().charAt(0);

        }
    }
}