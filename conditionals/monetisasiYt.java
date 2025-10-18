import java.util.Scanner;

public class monetisasiYt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int pelanggan = input.nextInt();

        int jamTonton = input.nextInt();

        if (pelanggan >= 1000 && jamTonton >= 4000) {
            System.out.println("sudah dapat dimonetisasi");
        } else {
            System.out.println("belum dapat dimonetisasi");
        }

        input.close();
    }
}





