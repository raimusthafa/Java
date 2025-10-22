import java.util.Scanner;

public class garislurus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double m = input.nextDouble();
        double c = input.nextDouble();

        if (c == 0) {
            System.out.println("melewati");
        } else {
            System.out.println("tidak melewati");
        }
    }
}
