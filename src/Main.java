import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userChoice;

        System.out.println("You are a treasure hunter whose target is a cave in a land of dragons.\n" +
                "Dragons are temperamental and will either share their gold or eat you whole.\n" +
                "You approach one of their caves and must make a choice. One of these caves will lead\n" +
                "to a hungry dragon, while the other will lead to a friendly one...\n" +
                "Which cave will you choose? (1 or 2)\n");

        userChoice = input.nextInt();

        switch(userChoice) {
            case 1: {
                System.out.println("As you enter the cave you can hear a low growl\n" +
                        "As you go further in you see a giant dragon loom over you as it opens its jaw\n" +
                        "You are gobbled down in one bite"
                        );
                break;
            }

            case 2: {
                System.out.println("As you enter the cave you can see a light glimmer around a corner\n" +
                        "You turn the corner to see a dragon sitting peacefully.\n" +
                        "The dragon gestures and moves its tail push a pile of gold towards you."
                        );
            }
        }
    }

}
