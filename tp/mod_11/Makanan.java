import java.util.Scanner;

public class Makanan {

    // Hitung kalori makanan karbo
    public static int makanKarbo(int porsi, int kaloriPerPorsi) {
        return porsi * kaloriPerPorsi;
    }

    // Hitung kalori makanan protein 
    public static int makanProtein(int porsi, int kaloriPerPorsi) {
        return porsi * kaloriPerPorsi;
    }

    // Hitung kalori cemilan
    public static int makanCemilan(int jumlah, int kaloriPerItem) {
        return jumlah * kaloriPerItem;
    }

    // MAIN PROGRAM
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int porsiKarbo = sc.nextInt();
        int kalKarbo = sc.nextInt();

        int porsiProtein = sc.nextInt();
        int kalProtein = sc.nextInt();

        int jumlahCemilan = sc.nextInt();
        int kalCemilan = sc.nextInt();

        int total = 0;
        total += makanKarbo(porsiKarbo, kalKarbo);
        total += makanProtein(porsiProtein, kalProtein);
        total += makanCemilan(jumlahCemilan, kalCemilan);

        System.out.println(total);
    }
}
