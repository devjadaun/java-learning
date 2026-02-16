import java.util.Scanner;

public class NestedLoop {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        // Example nested loop (fixed size)
        for (int i = 1; i <= 3; i++){
            for (int j = 1; j <= 9; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }

        int rows;
        int columns;
        char symbol;

        System.out.print("\nEnter the # of rows: ");
        rows = scanner.nextInt();

        System.out.print("Enter the # of columns: ");
        columns = scanner.nextInt();

        if (rows <= 0 || columns <= 0){
            System.out.println("Rows and columns must be positive.");
            scanner.close();
            return;
        }

        System.out.print("Enter the symbol to use: ");
        symbol = scanner.next().charAt(0);

        System.out.println("\nYour pattern:\n");

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                System.out.print(symbol + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}