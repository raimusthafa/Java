import java.util.Scanner;

public class lulus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai Anda: ");
        int nilai = input.nextInt();

        if (nilai == -1) {
            System.out.println("Invalid.");
        } else if (nilai >= 60) {
            System.out.println("Anda lulus ujian.");
        } else {
            System.out.println("Anda tidak lulus ujian.");
        }

        input.close();
    }
}
