import java.util.Scanner;

public class suhustats {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta jumlah data suhu
        System.out.print("Masukkan jumlah data suhu: ");
        int jumlah = input.nextInt();

        double total = 0;
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;

        for (int i = 1; i <= jumlah; i++){
            System.out.print("Suhu ke-" + i + ": ");
            double suhu = input.nextDouble();

            total += suhu;
            if (suhu < min) min = suhu;
            if (suhu > max) max = suhu;
        }

        double rata = total / jumlah;

        System.out.println("\nSuhu Terendah: " + min);
        System.out.println("Suhu Tertinggi: " + max);
        System.out.println("Rata-rata   : " + rata);

    }
}
