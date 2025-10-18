import java.util.Scanner;

public class Kelilingsegitiga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan sisi pertama segitiga: ");
        double a = input.nextDouble();
        
        System.out.print("Masukkan sisi kedua segitiga: ");
        double b = input.nextDouble();
        
        System.out.print("Masukkan sisi ketiga segitiga: ");
        double c = input.nextDouble();
        
        double keliling = a + b + c;
        
        System.out.println("Keliling segitiga adalah: " + keliling);
        
        input.close();
    }
}
