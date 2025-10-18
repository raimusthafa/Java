import java.util.Scanner;

public class bilanganTerkecil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int terkecil = a;

        if (b < terkecil) {
            terkecil = b;
        }
        if (c < terkecil) {
            terkecil = c;
        }

        System.out.println(terkecil);

        input.close();
    }
}





