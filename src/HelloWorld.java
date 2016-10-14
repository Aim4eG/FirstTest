/**
 * Created by Lenovo on 28.09.2016.
 */
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("My arguments:");
        for (int i = 0; i < args.length; i++) {
            System.out.println("arg[" + i + "] : " + args[i]);
        }
        System.out.println("Goodbye!");

    }
}
