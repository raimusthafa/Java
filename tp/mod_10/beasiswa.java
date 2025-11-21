
import java.util.Scanner;

public class beasiswa {
    public static boolean beasiswaPenuh(double ipk, double penghasilan){
        return ipk >= 3.75 && penghasilan <= 5;
    }
    public static boolean  beasiswaParsial(double ipk, double penghasilan){
        return ipk >= 3.25 && ipk <= 3.74 && penghasilan >= 5 
        && penghasilan <= 10;
    }
    public static boolean tidakDapatBeasiswa(double ipk, double penghasilan){
        return ipk < 3.25 && penghasilan > 10;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double ipk = input.nextDouble();
        double penghasilan = input.nextDouble();

        String hasil;

        if(beasiswaPenuh(ipk, penghasilan)){
            hasil = "Beasiswa Penuh";
        } else if (beasiswaParsial(ipk, penghasilan)) {
            hasil = "Beasiswa Parsial";
        } else {
            hasil = "Tidak Dapat Beasiswa";
        }

        System.out.print(hasil);
    }
}