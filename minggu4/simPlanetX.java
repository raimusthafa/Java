import java.util.Scanner;

public class simPlanetX {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int umur = input.nextInt();
        boolean fasihJava = input.nextBoolean();
        int nilaiTes = input.nextInt();

        boolean bisaDapatSIM = (umur >= 10) && fasihJava && (nilaiTes == 100);

        System.out.println(bisaDapatSIM);

        input.close();
    }
}





