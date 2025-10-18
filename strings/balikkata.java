import java.util.Scanner;

public class balikkata {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // input teks
        System.out.print("Masukkan teks: ");
        String teks = input.nextLine();

        // variabel hasil awalnya kosong
        String hasil = "";

        // loop untuk membalik kata
        for (int i = 0; i < teks.length(); i++) {
            hasil = teks.charAt(i) + hasil;  // tambahkan huruf ke depan
        }

        // tampilkan hasil
        System.out.println("Hasil dibalik: " + hasil);

        input.close();
    }
}
