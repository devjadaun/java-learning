import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String[] fruits = {"apple", "orange", "banana"};
        boolean isFound = false;

        System.out.print("Enter a fruit to search for: ");
        String target = scanner.nextLine();

        for (int i = 0; i < fruits.length; i++){
            if (fruits[i].equalsIgnoreCase(target)){
                System.out.println("Fruit found at index: " + i);
                isFound = true;
                break;
            }
        }

        if (!isFound){
            System.out.println("Fruit not found in the array");
        }

        scanner.close();
    }
}