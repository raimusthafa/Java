import java.util.Scanner;

public class hitungZ {

public static double z(int x, int y){
    return 5 * Math.sqrt(x);
    }

public static void main (String[] args) {
    Scanner input = new Scanner(System.in);

    int a = input.nextInt();
    int b = input.nextInt();

    double zSatu = z(a, b);
    double zDua = z(b, a);

    System.out.printf("%.3f %.3f\n", zSatu, zDua);
}
}