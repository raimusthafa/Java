import java.util.Scanner;

public class jumlah_hari_bulan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan tahun: ");
        int tahun = input.nextInt();
        
        System.out.print("Masukkan nama bulan (3 huruf, huruf pertama kapital): ");
        String bulan = input.next();
        
        int jumlahHari = 0;
        boolean valid = true;

        switch (bulan) {
            case "Jan": case "Mar": case "May": case "Jul":
            case "Aug": case "Oct": case "Dec":
                jumlahHari = 31;
                break;
            case "Apr": case "Jun": case "Sep": case "Nov":
                jumlahHari = 30;
                break;
            case "Feb":
                // Cek tahun kabisat
                if ((tahun % 400 == 0) || (tahun % 4 == 0 && tahun % 100 != 0))
                    jumlahHari = 29;
                else
                    jumlahHari = 28;
                break;
            default:
                valid = false;
                break;
        }
        
        if (valid)
            System.out.println(bulan + " " + tahun + " memiliki " + jumlahHari + " hari");
        else
            System.out.println(bulan + " bukan nama bulan yang benar");
        
        input.close();
    }
}
