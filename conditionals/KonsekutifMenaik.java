import java.util.Scanner;

public class KonsekutifMenaik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if (b == a + 1 && c == b + 1) {
            System.out.println("ya");
        } else {
            System.out.println("tidak");
        }

        input.close();
    }
}





