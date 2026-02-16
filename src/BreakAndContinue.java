public class BreakAndContinue {
    public static void main(String[] args){

        // break = stop the loop completely
        // continue = skip current iteration and continue loop

        System.out.println("Using break:");

        for (int i = 0; i < 10; i++){
            if (i == 5){
                break;
            }
            System.out.print(i + " ");
        }

        System.out.println("\n");

        System.out.println("Using continue:");

        for (int i = 0; i < 10; i++){
            if (i == 5){
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
