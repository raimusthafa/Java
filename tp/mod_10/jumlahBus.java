
import java.util.Scanner;


public class jumlahBus {
    public static int jumlahBus(int penumpang, int kapasitas) {
        return (penumpang + kapasitas - 1) / kapasitas;
    }

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int m = input.nextInt();

        int hasil = jumlahBus(n, m);

        System.out.println(hasil + " bus");
    }
}