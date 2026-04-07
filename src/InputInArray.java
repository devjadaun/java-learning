import java.util.Scanner;

public class InputInArray {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many foods do you want?: ");
        int size = scanner.nextInt();

        if (size <= 0){
            System.out.println("Size must be greater than 0.");
            scanner.close();
            return;
        }

        scanner.nextLine(); // clear buffer

        String[] foods = new String[size];

        for(int i = 0; i < foods.length; i++){
            System.out.print("Enter food #" + (i + 1) + ": ");
            foods[i] = scanner.nextLine();
        }

        System.out.println("\nYour food list:");

        for (String food : foods){
            System.out.println("- " + food);
        }

        scanner.close();
    }
}