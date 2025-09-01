import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // Performing operations
        int sum = num1 + num2;
        int diff = num1 - num2;
        int product = num1 * num2;
        double quotient = (num2 != 0) ? (double) num1 / num2 : 0;

        // Display results
        System.out.println("\nResults:");
        System.out.println("Addition = " + sum);
        System.out.println("Subtraction = " + diff);
        System.out.println("Multiplication = " + product);
        if (num2 != 0) {
            System.out.println("Division = " + quotient);
        } else {
            System.out.println("Division = Cannot divide by zero!");
        }

        sc.close();
    }
}
