import java.util.Scanner;

public class tebakkata {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String kataRahasia = "JAVA";
        String tebakan = "";

        System.out.println("Tebak kata rahasia (hint: bahasa pemrograman):");

        while (!tebakan.equalsIgnoreCase(kataRahasia)) {
            System.out.print("Masukkan tebakan: ");
            tebakan = input.nextLine();

            if (!tebakan.equalsIgnoreCase(kataRahasia)) {
                System.out.println("Salah! Coba lagi!");
            }
        }

        System.out.println("Benar! Kata rahasianya adalah JAVA");
    }
}
