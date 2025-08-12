import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get user's name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        // Get user's age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        // Print the result in the specified format
        System.out.println("Your name is " + name + " and your age is " + age);
        
        scanner.close();
    }
}
