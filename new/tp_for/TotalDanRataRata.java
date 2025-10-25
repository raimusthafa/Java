public class TotalDanRataRata {
    public static void main(String[] args) {
        int total = 0;
        int batas = 500;

        for(int i = 1; i <= batas; i++){
            total += i;
        }

        double rataRata = (double) total / batas;

        System.out.println("Total : " + total);
        System.out.println("Rata-rata : " + rataRata);
    }
}
