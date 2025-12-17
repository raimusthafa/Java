import java.util.Scanner;

public class baru {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] mapel = {
            "BINDO",
            "SEJARAH",
            "FISIKA",
            "KIMIA"
        };

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = input.nextInt();

        int[][] nilai = new int[jumlah][4];

        // INPUT NILAI
        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nMasukkan nilai mahasiswa ke-" + (i + 1));
            for (int j = 0; j < 4; j++) {
                System.out.print("Masukkan Nilai " + mapel[j] + ": ");
                nilai[i][j] = input.nextInt();
            }
        }

        /* ================== TABEL DI ATAS ================== */
        System.out.println("\n==================== TABEL NILAI ====================");
        System.out.println("Siswa | BINDO | SEJARAH | FISIKA | KIMIA | Rata-rata | Grade");
        System.out.println("------------------------------------------------------");

        for (int i = 0; i < jumlah; i++) {
            int total = 0;

            System.out.print((i + 1) + "     ");

            for (int j = 0; j < 4; j++) {
                System.out.print("| " + nilai[i][j] + "    ");
                total += nilai[i][j];
            }

            double rata = total / 4.0;
            char grade;

            if (rata >= 85) {
                grade = 'A';
            } else if (rata >= 75) {
                grade = 'B';
            } else if (rata >= 65) {
                grade = 'C';
            } else if (rata >= 50) {
                grade = 'D';
            } else {
                grade = 'E';
            }

            System.out.printf("| %.2f     | %c\n", rata, grade);
        }

        System.out.println("======================================================");

        /* ============ DETAIL PER MAHASISWA DI BAWAH ============ */
        for (int i = 0; i < jumlah; i++) {

            int nilaiTertinggi = nilai[i][0];
            int nilaiTerendah = nilai[i][0];
            String mapelTerendah = mapel[0];

            for (int j = 1; j < 4; j++) {
                if (nilai[i][j] > nilaiTertinggi) {
                    nilaiTertinggi = nilai[i][j];
                }

                if (nilai[i][j] < nilaiTerendah) {
                    nilaiTerendah = nilai[i][j];
                    mapelTerendah = mapel[j];
                }
            }

            System.out.println("\nMahasiswa ke-" + (i + 1));
            System.out.println("Nilai tertinggi      : " + nilaiTertinggi);
            System.out.println("Mapel nilai terendah : "
                    + mapelTerendah + " (" + nilaiTerendah + ")");
        }

        input.close();
    }
}
