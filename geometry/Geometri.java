import java.util.Scanner;

public class Geometri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int u1 = input.nextInt();
        int u2 = input.nextInt();
        int u3 = input.nextInt();

        if (u1 != 0 && u2 / u1 == u3 / u2) {
            System.out.println("ya");
        } else {
            System.out.println("tidak");
        }

        input.close();
    }
}





