import java.util.Scanner;

public class sanya {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asking for user's name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Asking for user's age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Outputting the result
        System.out.println("Hello, " + name + "! You are " + age + " years old.");

        scanner.close();
    }
}
