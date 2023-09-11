package Part3;

import java.util.Scanner;

public class Task1 {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        double result = 0.0;
        double firstOperand = 0.0;
        double secondOperand = 0.0;
        double currentResult = 0.0;

        print("Hello. I'm your lovely calculator");

        do {

            print("Please select an operation by entering relevant value");
            print("Enter 1 for + (add)");
            print("Enter 2 for - (subtract)");
            print("Enter 3 for * (multiply)");
            print("Enter 4 for / (divide)");

            int operation = in.nextInt();

            if (result == 0.0) {
                print("Please enter first operand");
                firstOperand = getOperand();
            } else {
                firstOperand = result;
            }

            print("Please enter second operand");
            secondOperand = getOperand();

            switch (operation) {

                case 1:
                    result = add(firstOperand, secondOperand);
                    break;
                case 2:
                    result = subtract(firstOperand, secondOperand);
                    break;
                case 3:
                    result = multiply(firstOperand, secondOperand);
                    break;
                case 4:
                    if (secondOperand == 0) {
                        System.out.println("Cannot calculate: division by zero. Let's try again");
                        continue;
                    }
                    result = divide(result, secondOperand);
                    break;
                default:
                    System.out.println("Invalid choice. Let's try again");
                    continue;
            }

            print("Result is: " + result);

            boolean cont = askShouldWeContinue();

            if (!cont) {
                break;
            }

        } while (true);

    }

    public static String getUserString() {

        return in.next();

    }

    public static boolean askShouldWeContinue() {

        print("Do you want to try again?");

        String result = getUserString();

        return (result.toLowerCase().equals("y"));

    }

    private static double getOperand() {
        return in.nextDouble();
    }

    private static double add(double a, double b) {
        return a + b;
    }

    private static double subtract(double a, double b) {
        return a - b;
    }

    private static double multiply(double a, double b) {
        return a * b;
    }

    private static double divide(double a, double b) {
        return a / b;
    }

    public static void print(String string) {
        System.out.println(string);
    }
}
