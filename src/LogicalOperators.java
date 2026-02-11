import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args){

        // && -> AND
        // || -> OR
        // !  -> NOT

        double temp = 35;
        boolean isSunny = false;

        // Weather logic
        if (temp >= 0 && temp <= 30 && isSunny){
            System.out.println("The weather is good 😊");
            System.out.println("It is sunny outside 🌞");

        } else if (temp >= 0 && temp <= 30 && !isSunny) {
            System.out.println("The weather is good 😊");
            System.out.println("It is cloudy outside ☁️");

        } else if (temp > 30 || temp < 0) {
            System.out.println("The weather is bad 😩");
        }

        Scanner scanner = new Scanner(System.in);

        // Username validation rules:
        // length must be between 4 and 12
        // must not contain spaces or underscores

        System.out.print("Enter your username: ");
        String username = scanner.nextLine();

        if (username.length() < 4 || username.length() > 12){
            System.out.println("Username must be between 4 and 12 characters");

        } else if (username.contains(" ") || username.contains("_")) {
            System.out.println("Username must not contain spaces or underscores");

        } else {
            System.out.println("Welcome " + username);
        }

        scanner.close();
    }
}