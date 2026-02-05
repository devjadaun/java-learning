import java.util.Scanner;
public class Mathclass {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(Math.PI);
        System.out.println(Math.E);

        double result1;
        double result2;
        double result3;
        double result4;
        double result5;
        double result6;
        double result7;
        double result8;

        result1 = Math.pow(2, 3);
        result2 = Math.abs(-5);
        result3 = Math.sqrt(9);
        result4 = Math.round(3.14);
        result5 = Math.ceil(3.14);
        result6 = Math.floor(3.14);
        result7 = Math.max(10, 20);
        result8 = Math.min(10, 20);


        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);
        System.out.println(result7);
        System.out.println(result8);


        // HYPOTENUSE c = Math.sqrt(a² + b²)

        double a;
        double b;
        double c;

        System.out.print("Enter the length of side A: ");
        a = scanner.nextDouble();

        System.out.print("Enter the length of side B: ");
        b = scanner.nextDouble();

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.println("The hypotenuse (side c) is: " + c + "cm");

        // circumference = 2 * Math.PI * radius;
        // area = Math.PI * math.pow(radius, 2);
        // volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        double radius;
        double circumference;
        double area;
        double volume;

        System.out.print("Enter the radius: ");
        radius = scanner.nextDouble();

        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        System.out.printf("The circumference is %.1fcm\n", circumference);
        System.out.printf("The area is %.1fcm²\n", area);
        System.out.printf("The volume is %.1fcm³\n", volume);

        scanner.close();
    }
}
