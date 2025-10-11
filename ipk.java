import java.util.Scanner;
public class ipk {    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama mahasiswa: ");
        String nama = input.nextLine();
        System.out.print("Masukkan IPK: ");
        double ipk = input.nextDouble();
        if (ipk >= 3.50) {
            System.out.print(nama + " layak mendapatkan beasiswa penuh");
        } else if (ipk >= 3.00) {
            System.out.print(nama + " layak mendapatkan beasiswa parsial");
        }
        else if (ipk < 3.00) {
            System.out.print(nama + " belum memenuhi syarat beasiswa");
        } else {
            System.out.print("IPK tidak valid");
        }
    }
}