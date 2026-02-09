import java.util.Scanner;

public class Compoundinterestcalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Compound Interest Calculator

        double principle;
        double rate;
        int timesCompounds;
        int years;
        double amount;

        System.out.print("Enter the principle amount: ");
        principle = scanner.nextDouble();

        System.out.print("Enter the interest rate (in %): ");
        rate = scanner.nextDouble() / 100;

        System.out.print("Enter the # of times compounded per year: ");
        timesCompounds = scanner.nextInt();

        System.out.print("Enter the numbers of years: ");
        years = scanner.nextInt();

        amount = principle * Math.pow(1 + rate / timesCompounds, timesCompounds * years);

        System.out.printf("The amount after %d years is %.2f", years, amount);


        scanner.close();
    }
}