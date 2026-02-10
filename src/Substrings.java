import java.util.Scanner;

public class Substrings {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        // .substring() extracts a portion of a string
        // substring(start, end)

        System.out.print("Enter your email: ");
        String email = scanner.nextLine();

        if (email.contains("@") &&
                email.indexOf("@") != 0 &&
                email.indexOf("@") != email.length() - 1) {

            String username = email.substring(0, email.indexOf("@"));
            String domain = email.substring(email.indexOf("@") + 1);

            System.out.println("Username: " + username);
            System.out.println("Domain: " + domain);

        } else {
            System.out.println("Invalid email. It must contain '@' in the middle.");
        }

        scanner.close();
    }
}
