import java.util.Scanner;

public class kelipatanbilangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int a = input.nextInt();
        int b = input.nextInt();

        if (b == 0) {
            System.out.println("Tidak dapat memeriksa, pembagi tidak boleh nol");
        } else if (a % b == 0) {
            System.out.println("Ya, " + a + " kelipatan " + b);
        } else {
            System.out.println("Tidak, " + a + " bukan kelipatan " + b);
        }
    }
}
