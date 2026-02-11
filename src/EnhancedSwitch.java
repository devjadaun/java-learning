import java.util.Scanner;

public class EnhancedSwitch {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        // Enhanced switch = modern replacement for multiple else-if statements

        System.out.print("Enter the day of the week: ");
        String day = scanner.nextLine().trim();

        // Normalize input case
        day = day.substring(0,1).toUpperCase() + day.substring(1).toLowerCase();

        switch (day){
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" ->
                    System.out.println("It is a weekday 😣");

            case "Saturday", "Sunday" ->
                    System.out.println("It is the weekend 😇");

            default ->
                    System.out.println(day + " is not a valid day");
        }

        scanner.close();
    }
}
