public class Printf {
    public static void main(String[] args) {

        // printf() = is a method used to format output

        // %[flags][width][.pricision][specifier-character]

        String name = "Spongebob";
        char firstLatter = 'S';
        int age = 30;
        double height = 60.5;
        boolean isEmployed = true;

        double price1 = 9.99;
        double price2 = 10000.16;
        double price3 = -54.01;

        int id = 456;

        System.out.printf("Hello %s\n", name);
        System.out.printf("Your name starts with a %c\n", firstLatter);
        System.out.printf("You are %d years old\n", age);
        System.out.printf("You are %f inches tall\n", height);
        System.out.printf("Employed %b\n", isEmployed);

        System.out.printf("%s is %d years old\n", name, age);
        System.out.printf("%+.1f\n", price1);
        System.out.printf("%,.2f\n", price2);
        System.out.printf("%(.3f\n", price3);

        System.out.printf("%04d\n", id);

    }
}
