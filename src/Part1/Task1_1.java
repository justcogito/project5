package Part1;
import java.util.Scanner;

// Project 5. Part 1. Task 1.1
public class Task1_1 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        String someString = "";
        int someNumber = 0;

        inputValues(someString, someNumber);

    }

    public static void inputValues(String someString, int someNumber) {

        System.out.println("Please input a string");
        someString = in.nextLine();

        System.out.println("Please input a number");
        someNumber = in.nextInt();

    }

}