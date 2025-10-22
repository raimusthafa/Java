import java.util.Scanner;

public class kapasitasbus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int kapasitas = input.nextInt();
        int penumpang = input.nextInt();

        double batasMin = 0.5 * kapasitas;  
        double batasMax = 0.75 * kapasitas; 

        if (penumpang >= batasMin && penumpang <= batasMax) {
            System.out.println("berangkat");
        } else {
            System.out.println("tidak berangkat");
        }
    }
}
