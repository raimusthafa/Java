import java.util.Scanner;

public class ganjilgenap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int u1 = input.nextInt();
        int u2 = input.nextInt();
        int u3 = input.nextInt();

        if (u1 % 2 != 0 && u2 % 2 != 0 && u3 % 2 != 0) {
            System.out.println("ganjil");
        }

        else if (u1 % 2 == 0 && u2 % 2 == 0 && u3 % 2 == 0) {
            System.out.println("genap");
        }

        else {
            System.out.println("bukan ganjil atau genap");
        }

        input.close();
    }
}





