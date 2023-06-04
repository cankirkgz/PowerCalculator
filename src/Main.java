import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int num; // Variable to hold the number to be retrieved from the user
        int i, k; // Counter variables to use in loops

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz.");
        num = scanner.nextInt();

        // Loop that calculates powers of 4
        for (i = 1; i < num ; i*=4){
            System.out.println(i);
        }
        // Loop that calculates powers of 5
        for (k = 1; k < num ; k*=5){
            System.out.println(k);
        }
    }
}