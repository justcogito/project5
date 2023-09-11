package Part1;
import java.util.Scanner;

// Project 5. Part 1. Task 1.2
public class Task1_2 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        String someString = "Some string";
        int someNumber = 2501;
        boolean someBoolean = true;

        outputValues(someString, someNumber, someBoolean);

    }

    public static void outputValues(String someString, int someNumber, boolean someBoolean) {

        System.out.println("Your string is: " + someString);
        System.out.println("Your number is: " + someNumber);
        System.out.println("Your boolean is: " + someBoolean);

    }
}