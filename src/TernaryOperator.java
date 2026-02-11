public class TernaryOperator {
    public static void main(String[] args){

        // Ternary operator ( ? : ) returns one of two values based on a condition
        // variable = (condition) ? valueIfTrue : valueIfFalse;

        int score = 55;
        int num = 3;
        int hours = 13;
        int income = 60000;

        String passOrFail = (score >= 60) ? "Pass" : "Fail";
        String evenOrOdd = (num % 2 == 0) ? "Even" : "Odd";
        String timeOfDay = (hours < 12) ? "A.M." : "P.M.";
        double taxRate = (income >= 40000) ? 0.25 : 0.15;

        System.out.println(passOrFail);
        System.out.println(evenOrOdd);
        System.out.println(hours + " " + timeOfDay);
        System.out.println("Tax Rate is " + taxRate);
    }
}