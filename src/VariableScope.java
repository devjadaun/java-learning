public class VariableScope {

    static int x = 3;   // CLASS (global)

    public static void main(String[] args){

        int x = 1;  // LOCAL

        System.out.println("Local x in main: " + x);
        System.out.println("Class x: " + VariableScope.x);

        doSomething();
    }

    static void doSomething(){
        int x = 2;  // LOCAL

        System.out.println("Local x in doSomething: " + x);
        System.out.println("Class x: " + VariableScope.x);
    }
}