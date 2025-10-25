import java.util.Scanner;

public class PolaBintang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah baris: ");
        int n = input.nextInt();  // Contoh: 7

        for(int i = 1; i <= n; i++){ // perulangan jumlah baris
            for(int j = 1; j <= i; j++){ // mencetak bintang sesuai nomor baris
                System.out.print("*");
            }
            System.out.println(); // pindah ke baris berikutnya
        }
    }
}
