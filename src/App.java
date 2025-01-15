import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input  = new Scanner(System.in);

        System.out.print("Enter your name\n> ");
        String name = input.nextLine();
        System.out.println("Hello, " + name + "!");
    } 
}
