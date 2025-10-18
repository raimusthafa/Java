import java.util.Scanner;

public class hargaBuryam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean suwirAyam = input.nextBoolean();
        boolean cakue = input.nextBoolean();
        boolean atiAmpela = input.nextBoolean();
        boolean telur = input.nextBoolean();

        int total = 6000; 

        if (suwirAyam) {
            total += 3000;
        }
        if (cakue) {
            total += 1500;
        }
        if (atiAmpela) {
            total += 4500;
        }
        if (telur) {
            total += 4000;
        }
        System.out.println(total);

        input.close();
    }
}





