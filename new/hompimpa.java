import java.util.Scanner;

public class hompimpa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input tiga arah tangan (A atau B)
        String p1 = input.next();
        String p2 = input.next();
        String p3 = input.next();

        if (p1.equals(p2) && !p1.equals(p3)) {
            System.out.println("pemain 3 pemenang");
        } else if (p1.equals(p3) && !p1.equals(p2)) {
            System.out.println("pemain 2 pemenang");
        } else if (p2.equals(p3) && !p1.equals(p2)) {
            System.out.println("pemain 1 pemenang");
        } else {
            System.out.println("imbang");
        }
    }
}
