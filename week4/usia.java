import java.util.Scanner;

public class usia {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan umur Anda: ");
        int usia = input.nextInt();

        if (usia < 13){
            System.out.print("Anak-anak");
        } else if (usia >= 13 && usia <= 17){
            System.out.print("Remaja");
        } else if (usia >= 18 && usia <= 59){
            System.out.print("Dewasa");
        } else if (usia >= 60){
            System.out.print("Lansia");
        } else {
            System.out.print("Umur tidak valid");
        }
        input.close();
    }
}
