import java.util.Scanner;

public class atm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int saldo = 10000000; // saldo awal 10 juta
        String passwordBenar = "1234";
        int percobaan = 0;
        boolean loginBerhasil = false;

        // Proses login
        do {
            System.out.print("Masukkan password: ");
            String password = input.nextLine();

            if (password.equals(passwordBenar)) {
                loginBerhasil = true;
                System.out.println("Login berhasil!\n");
            } else {
                percobaan++;
                System.out.println("Password salah! Percobaan ke-" + percobaan);
            }
        } while (!loginBerhasil && percobaan < 3);

        // Jika gagal login
        if (!loginBerhasil) {
            System.out.println("\nAkun terblokir! Anda telah 3 kali salah memasukkan password.");
            return; // keluar dari program
        }

        // Menu utama ATM
        int pilihan;
        do {
            System.out.println("=== MENU ATM ===");
            System.out.println("1. Cek Saldo");
            System.out.println("2. Tarik Tunai");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Saldo Anda saat ini: Rp " + saldo);
                    break;

                case 2:
                    System.out.print("Masukkan jumlah uang yang ingin ditarik: Rp ");
                    int tarik = input.nextInt();

                    if (tarik <= saldo && tarik > 0) {
                        saldo -= tarik;
                        System.out.println("Penarikan berhasil! Sisa saldo Anda: Rp " + saldo);
                    } else if (tarik <= 0) {
                        System.out.println("Jumlah penarikan tidak valid!");
                    } else {
                        System.out.println("Saldo tidak mencukupi!");
                    }
                    break;

                case 3:
                    System.out.println("Terima kasih telah menggunakan ATM kami!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid! Silakan coba lagi.");
            }

            System.out.println(); // baris kosong
        } while (pilihan != 3);

        input.close();
    }
}
