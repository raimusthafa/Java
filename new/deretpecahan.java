import java.util.Scanner;

public class deretpecahan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input n dan m
        System.out.print("Masukkan nilai n: ");
        int n = input.nextInt();

        System.out.print("Masukkan nilai m: ");
        int m = input.nextInt();

        double jumlah = 0.0;

        for (int i = n; i <= m; i++) {
            jumlah += 4.0 / i;
        }

        System.out.printf("%.2f\n", jumlah);

        input.close();
    }
}
