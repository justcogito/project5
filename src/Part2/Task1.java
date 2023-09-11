package Part2;

import java.util.Scanner;

// Project 5. Part 2
public class Task1 {
    static Scanner in = new Scanner(System.in);

/*  START:
    Print "Hello..."
    WHILE TRUE LOOP:
        Get age (input)
        Give recommendation according to age:
            IF age < 6
                Only print recommendation for age < 6
            ELSE IF lower value < age <= upper value or if age > 50
                Get favorite genre (input)
                IF genre is recognized
                    Print recommendation for this age and genre
                ELSE
                    Print default recommendation for this age
        Ask a question "Should we continue"
        Get an answer (input)
        IF weShouldContinue = false
            Then BREAK.
    END.
*/
    public static void main(String[] args) {

        print("Hello. I'll be your virtual assistant. Tell me about yourself so I can recommend you some books to read.");


        while (true) {

            int age = getAge();

            giveRecommendation(age);

            boolean weShouldContinue = askShouldWeContinue();

            if (!weShouldContinue) {
                break;
            }

        }
    }

    public static void giveRecommendation(int age) {

        if (age < 6) {

            giveRecommendationAgeUnder6();

        } else if ((age >= 6) && (age < 16)) {

            giveRecommendationAge6ToUnder16();

        } else if ((age >= 16) && (age < 30)) {

            giveRecommendationAge16ToUnder30();

        } else if ((age >= 30) && (age < 50)) {

            giveRecommendationAge30ToUnder50();

        } else if (age >= 50) {

            giveRecommendationAgeFrom50();

        }

    }


    public static boolean askShouldWeContinue() {

        print("Do you want to try again?");

        String result = getUserString();

        return (result.toLowerCase().equals("y"));

    }

    public static String getUserString() {

        return in.next();

    }

    public static int getUserInt() {

        return in.nextInt();

    }

    public static void print(String string) {

        System.out.println(string);

    }

    public static int getAge() {

        print("How old are you?");
        return getUserInt();

    }

    public static void giveRecommendationAgeUnder6() {

        print("I can't imagine you having preferences at such a young age. So I'll recommend you some fairy tale books.");
        print("You may enjoy \"Rapunzel\" by Bethan Woollvin, or maybe \"Prince & Knight\" by Daniel Haack.");

    }

    public static void giveRecommendationAge6ToUnder16() {

        print("I guess you have already developed a taste. What genre of book do you prefer?");
        String genre = getUserString();

        switch (genre) {
            case "fantasy":
                print("Nice. Then I'll recommend you \"Ravensong\" by TJ Klune");
                break;
            case "science fiction":
                print("Nice. Then I'll recommend you \"Rendezvous with Rama\"  by Arthur C. Clarke");
                break;
            default:
                print("So you actually do not have preferences.");
                print("Then I'll recommend a great fantasy book: \"The Hobbit\" by J. R. R. Tolkien.");
        }

    }

    public static void giveRecommendationAge16ToUnder30() {

        print("And what your favorite genre of book might be?");
        String genre = getUserString();

        switch (genre) {
            case "fantasy":
                print("Ok. Then I'll recommend you \"The Mystery at Dunvegan Castle\" by T. L. Huchu");
                break;
            case "detective":
                print("Nice. Then I'll recommend you \"The Name of the Rose\" by Umberto Eco");
                break;
            default:
                print("So you actually do not have preferences.");
                print("Then I'll recommend a great science fiction book: \"Solaris\", by Stanislaw Lem.");
        }

    }

    public static void giveRecommendationAge30ToUnder50() {

        print("Tell me about your exquisite taste of genres");
        String genre = getUserString();

        switch (genre) {
            case "romance":
                System.out.println("Sweet. Then I'll recommend you \"Glow\" by Raven Kennedy");
                break;
            case "classics":
                System.out.println("Good. Then I'll recommend you \"Pride and Prejudice\" by Jane Austen");
                break;
            default:
                System.out.println("So you actually do not have preferences.");
                System.out.println("Then I'll recommend a great classics: \"Jane Eyre\" by Charlotte Bronte.");
        }

    }

    public static void giveRecommendationAgeFrom50() {

        print("Tell me about your exquisite taste of genres");
        String genre = getUserString();

        switch (genre) {
            case "fantasy":
                System.out.println("Ok. Then I'll recommend you \"The Discord of Gods\" by Jenn Lyons");
                break;
            case "historical fiction":
                System.out.println("Good. Then I'll recommend you \"The Children of Jocasta\" by by Natalie Haynes");
                break;
            default:
                System.out.println("So you actually do not have preferences.");
                System.out.println("Then I'll recommend a great science fiction novel series: \"Berserker \" by Fred Saberhagen");
        }

    }

}
