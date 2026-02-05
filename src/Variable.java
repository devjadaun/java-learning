public class Variable {
    public static void main(String[] args){


        // PRIMITIVE DATATYPES


        // INT DATATYPE

        // steps to create a variable
        // 1:- declaration
        // 2:- assingment

        int age = 18;
        int year = 2025;
        int quantity = 2;
        int gta = 6;

        /* here we declare variable age of data type
         int and 18 is the assinged value to the variable age */

        System.out.println("Your age is " + age);
        System.out.println("The year is " + year);
        System.out.println("The quantity of fruits is " + quantity + "Kg");

        // DOUBLE DATATYPE

        double price = 99999.9;
        double gpa = 9.9;
        double temperature = -12.1;
        double pi = 3.14159;

        System.out.println("$" + price);
        System.out.println(gpa);
        System.out.println(temperature);

        // CHAR DATATYPE

        char grade = 'A';
        char symbol = '!';
        char currency = '$';
        char gender = 'M';

        System.out.println(grade);
        System.out.println(symbol);
        System.out.println(currency);

        // BOOLEAN DATATYPE

        boolean isStudent = true;   // isStudent is in camelcase
        boolean forSale = true;
        boolean isOnline = false;
        boolean isAdmin = true;

        System.out.println(isStudent);
        System.out.println(forSale);
        System.out.println(isOnline);

        // we do not use boolean to print directly
        // we use it to check something is true or false
        // we use boolean in condition as like this

        // here we do not require to write isStudent == true bcz default value of boolean datatype is true

        if (isStudent){
            System.out.println("You are a student");
        } else {
            System.out.println("You are not a student");
        }

        // REFERENCE DATATYPES
        // String
        // Array  (later)
        // Object (later)

        String name = "Dev Thakur";
        String food = "Pizza";
        String email = "fake123@gmail.com";
        String car = "BMW M4 CS";
        String colour = "Black";

        System.out.println("Hello " + name);    // this is called string concatenation
        System.out.println("Your favorite food is " + food);
        System.out.println("Your email is " + email);
        System.out.println("Your favorite car is " + car);

        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("Your gpa is " + gpa);
        System.out.println("Your grade is " + grade);
        System.out.println("Your choice is a " + colour + " " + year + " " + car);
        System.out.println("The price is " + currency + price);

        if(forSale){
            System.out.println("There is a " + car + " for sale");
        } else {
            System.out.println("The " + car + " is not for sale");
        }
    }
}