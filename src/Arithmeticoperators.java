public class Arithmeticoperators {
    public static void main(String[] args){

        // Arithmetic Operators

        int x = 10;
        int y = 2;
        int z;

        z = x + y;
        //z = x - y;
        //z = x * y;
        //z = x / y;
        //z = x % y;

        // Augmented Assingment Operators

        x += y;
        //x -= y;
        //x *= y;
        //x /= y;
        //x %= y;

        // Increment and Decrement Operators

        ++x;  // Pre-increment: increase first, then use the value
        x++;  // Post-increment: use first, then increase
        --x;
        x--;

        // Order of Operations [P-E-M-D-A-S]

        double result = 3 + 4 * (7 - 5) / 2.0;

        System.out.println(x);

        System.out.println(z);
    }
}
