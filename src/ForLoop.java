import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // for loop = execute code a certain number of times

        System.out.print("Enter how many times you want to loop: ");
        int max = scanner.nextInt();

        for (int i = 1; i <= max; i++){
            System.out.println(i);
        }

        System.out.print("\nHow many numbers to countdown from?: ");
        int start = scanner.nextInt();

        if (start <= 0){
            System.out.println("Enter a positive number for countdown.");
        } else {
            System.out.println("\nCountdown starting...");

            for (int i = start; i > 0; i--){
                System.out.println(i);
            }

            System.out.println("🎉 Happy New Year!");
        }

        scanner.close();
    }
}
