import java.util.Scanner;

public class HitungPositifNegatif {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();

        int positif = 0;
        int negatif = 0;

        if (a > 0) positif++;
        else if (a < 0) negatif++;

        if (b > 0) positif++;
        else if (b < 0) negatif++;

        if (c > 0) positif++;
        else if (c < 0) negatif++;

        if (d > 0) positif++;
        else if (d < 0) negatif++;

        System.out.println(positif + " " + negatif);

        input.close();
    }
}





