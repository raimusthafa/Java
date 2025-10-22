import java.util.Scanner;

public class temp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int temp = input.nextInt();
        
        String status;
        if (temp < 0) {
            status = "Freezing weather";
        } else if (temp >= 0 && temp <= 9) {
            status = "Very Cold weather";
        } else if (temp >= 10 && temp <= 19) {
            status = "Cold weather";
        } else if (temp >= 20 && temp <= 29) {
            status = "Normal in Temp";
        } else if (temp >= 30 && temp <= 39) {
            status = "It's Hot";
        } else {
            status = "It's Very Hot";
        }
        
        System.out.println(status);
    }
}
