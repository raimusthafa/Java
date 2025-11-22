import java.util.Scanner;

public class new1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah bus: ");
        int n = input.nextInt();
        input.nextLine(); // buang newline

        for (int i = 1; i <= n; i++) {
            System.out.println("\nData bus ke-" + i);
            System.out.print("Nama bus: ");
            String nama = input.nextLine();

            System.out.print("Kapasitas penumpang: ");
            int kapasitas = input.nextInt();

            System.out.print("Kelas bus (A/B/C): ");
            char kelas = input.next().toUpperCase().charAt(0);
            input.nextLine(); // buang newline

            int tarif;
            if (kelas == 'A') tarif = 30000;
            else if (kelas == 'B') tarif = 20000;
            else tarif = 10000;

            int total = kapasitas * tarif;

            System.out.println("→ Total tarif untuk " + nama + " = Rp " + total);
        }

        input.close();
    }
}
