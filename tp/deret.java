import java.util.Scanner;

public class deret {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int i = 1;
        int jumlah = 0;

        while (i <= n) {
            jumlah += i;
            i++;
        }

        System.out.println(jumlah);
        input.close();
    }
}
