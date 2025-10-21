import java.util.Scanner;

public class nilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String lanjut;

        do {
            System.out.print("Masukkan nama mahasiswa: ");
            String nama = input.nextLine();

            System.out.print("Masukkan nilai: ");
            int nilai = input.nextInt();
            input.nextLine(); // clear buffer

            String grade;
            if (nilai >= 85) grade = "A";
            else if (nilai >= 70) grade = "B";
            else if (nilai >= 60) grade = "C";
            else grade = "D";

            System.out.println(nama + " mendapatkan nilai " + grade);

            System.out.print("Input nilai lagi? (y/n): ");
            lanjut = input.nextLine();
        } while (lanjut.equalsIgnoreCase("y"));

        System.out.println("Program selesai.");
    }
}
