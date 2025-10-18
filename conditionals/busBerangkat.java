import java.util.Scanner;

public class busBerangkat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int kapasitas = input.nextInt();

        int penumpang = input.nextInt();


        double batasBawah = 0.5 * kapasitas;
        double batasAtas = 0.75 * kapasitas;

        if (penumpang >= batasBawah && penumpang <= batasAtas) {
            System.out.println("berangkat");
        } else {
            System.out.println("tidak berangkat");
        }

        input.close();
    }
}





