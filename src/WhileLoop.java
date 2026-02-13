import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        // Ask for name until not empty
        String name = "";
        while (name.isEmpty()){
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        }
        System.out.println("Hello " + name);

        // Quit game loop
        String response = "";
        while (!response.equalsIgnoreCase("Q")){
            System.out.println("You are playing a game");
            System.out.print("Press Q to quit: ");
            response = scanner.next();
        }
        System.out.println("You have quit the game");

        // Age validation using while
        int age;
        System.out.println("\nUsing while loop");

        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        while (age < 0){
            System.out.println("Your age can't be negative");
            System.out.print("Enter your age: ");
            age = scanner.nextInt();
        }
        System.out.println("You are " + age + " years old");

        // Age validation using do-while
        System.out.println("\nUsing do-while loop");

        do {
            System.out.print("Enter your age: ");
            age = scanner.nextInt();

            if (age < 0){
                System.out.println("Your age can't be negative");
            }

        } while (age < 0);

        System.out.println("You are " + age + " years old");

        // Number range validation
        int num;
        do {
            System.out.print("Enter a number between 1 - 10: ");
            num = scanner.nextInt();
        } while (num < 1 || num > 10);

        System.out.println("You picked " + num);

        scanner.close();
    }
}
