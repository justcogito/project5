package Part1;
import java.util.Scanner;

// Project 5. Part 1. Task 2
public class Task2 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        inputAndOutputData();

    }
    public static void inputAndOutputData() {

        String someString = inputString();
        int someNumber = inputNumber();
        int[] someArray = inputArray();

        outputData(someString, someNumber, someArray);

    }
    public static void outputData(String someString, int someNumber, int[] someArray) {

        System.out.println("Your string is: " + someString);
        System.out.println("Your number is: " + someNumber);

        outputArray(someArray);
    }
    public static void outputArray(int[] someArray) {

            for (int i = 0; i < someArray.length; i++) {
                System.out.println("Value of the " + (i + 1) + " element of array is " + someArray[i]);
            }

    }
    public static String inputString() {

        System.out.println("Please input a string");
        String someString = in.nextLine();

        return someString;
    }
    public static int inputNumber() {

        System.out.println("Please input a number");
        int someNumber = in.nextInt();

        return someNumber;
    }
    public static int[] inputArray() {

        System.out.println("Please input a number of elements of array");
        int numberOfElements = in.nextInt();

        int[] array = new int[numberOfElements];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Please input a value of element " + (i + 1));
            array[i] = in.nextInt();
        }

        return array;
    }
}