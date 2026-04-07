import java.util.Arrays;

public class ArraysMain {
    public static void main(String[] args){

        // array = a collection of values of the same data type
        //          * think of it as a variable that can store more than 1 value *

        String[] fruits = {"apple", "orange", "banana", "coconut"};

        //fruits[0] = "pineapple";
        int numOfFruits = fruits.length;

        System.out.println(fruits[0]);
        System.out.println(numOfFruits);

        // to print all elements

//        for (int i = 0; i < numOfFruits; i++){
//            System.out.print(fruits[i] + " ");
//        }

//        Arrays.sort(fruits);
//        Arrays.fill(fruits, "pineapple");

        // enhanced for loop

        for (String fruit : fruits){
            System.out.println(fruit);
        }

    }
}
