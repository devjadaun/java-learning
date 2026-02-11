import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double temp;
        double newTemp;
        String unit;

        System.out.print("Enter the temperature: ");
        temp = scanner.nextDouble();

        System.out.print("Convert to Celsius or Fahrenheit (C or F): ");
        unit = scanner.next().toUpperCase();

        // Ternary operator for conversion
        newTemp = (unit.equals("C"))
                ? (temp - 32) * 5 / 9      // Fahrenheit → Celsius
                : (temp * 9 / 5) + 32;     // Celsius → Fahrenheit

        System.out.printf("Converted temperature: %.1f °%s%n", newTemp, unit);

        scanner.close();
    }
}