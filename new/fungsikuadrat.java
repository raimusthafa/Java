import java.util.Scanner;

public class fungsikuadrat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        if (a > 0) {
            System.out.println("terbuka ke atas");
        } else if (a < 0) {
            System.out.println("terbuka ke bawah");
        } else {
            System.out.println("bukan fungsi kuadrat");
        }
    }
}
