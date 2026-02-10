import java.util.Locale;

public class Stringmethod {
    public static void main(String[] args){

        String name = "Dev Thakur";

        int length = name.length();
        char letter = name.charAt(0);
        int index = name.indexOf("e");
        int lastIndex = name.lastIndexOf("a");
        // name = name.toUpperCase();
        // name = name.toLowerCase();
        // name = name.trim();
        // name = name.replace("a", "o");


        System.out.println(length);
        System.out.println(letter);
        System.out.println(index);
        System.out.println(lastIndex);
        System.out.println(name);

        if (name.isEmpty()){
            System.out.println("Your name is empty");
        } else{
            System.out.println("Hello " + name);
        }

        if (name.contains(" ")){
            System.out.println("Your name contains space");
        } else {
            System.out.println("your name doesn't contain space");
        }

        if (name.equalsIgnoreCase("password")) {
            System.out.println("Your name can't be password");
        } else {
            System.out.println("Hello " + name);
        }

    }
}
