import java.util.Scanner;

public class ajakbioskop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean hariKerja = input.nextBoolean();
        int jamNonton = input.nextInt();
        boolean filmAksi = input.nextBoolean();

        boolean mauNonton = (!hariKerja && jamNonton > 19 && filmAksi);

        System.out.println(mauNonton);
    }
}
