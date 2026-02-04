import java.util.Scanner;

public class Userinput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();   // if we use only scanner.next() here it will only read word before space
        // it will neglect words which are after space

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("What is your GPA: ");
        double gpa = scanner.nextDouble();

        System.out.print("Are you a student (true/false): ");
        Boolean isStudent = scanner.nextBoolean();

        // Area of Rectangle

        double width = 0;
        double height = 0;
        double area = 0;

        System.out.print("Enter the width of rectangle: ");
        width = scanner.nextDouble();

        System.out.print("Enter the height of rectangle: ");
        height = scanner.nextDouble();

        area = width * height;

        System.out.println("Hello " + name);
        System.out.println("Your age is " + age);
        System.out.println("Your GPA is " + gpa);

        if(isStudent){
            System.out.println("You are enrolled as a  Student");
        } else {
            System.out.println("You are not enrolled as a Student");
        }

        System.out.println("Area of triangle = " + area);

        scanner.close();
    }
}
