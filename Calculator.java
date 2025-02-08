import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2;
        double result;
        int choice;

        // Menu display
        System.out.println("Simple Calculator");
        System.out.println("Choose an operation:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.print("Enter your choice (1/2/3/4): ");
        choice = scanner.nextInt();

        // Get numbers
        System.out.print("Enter first number: ");
        num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        num2 = scanner.nextDouble();

        // Perform chosen operation
        switch (choice) {
            case 1: // Addition
                result = num1 + num2;
                System.out.println("The result of addition is: " + result);
                break;
            case 2: // Subtraction
                result = num1 - num2;
                System.out.println("The result of subtraction is: " + result);
                break;
            case 3: // Multiplication
                result = num1 * num2;
                System.out.println("The result of multiplication is: " + result);
                break;
            case 4: // Division
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("The result of division is: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }

        scanner.close();
    }
}
