import java.util.Scanner;

public class cekPenjumlahanAdik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int hasilAdik = input.nextInt();

        int hasilBenar = a + b + c;

        if (hasilAdik == hasilBenar) {
            System.out.println("benar");
        } else {
            System.out.println("salah");
        }

        input.close();
    }
}





