import java.util.Random;
import java.util.Scanner;

public class Numbergame {
    public static void main(String[] args) {
        int guessednumber = 0;

        Scanner sc = new Scanner(System.in);

        // creating an instance of random class
        Random rand = new Random();

        //generating a random number
        int rand_1 = rand.nextInt(1, 100);

        System.out.println("Welcome to the Number Game!");
        System.out.println("I have generated the Number between 1 to 100");

        while (guessednumber != rand_1) {

            System.out.println("Try to guess the Number: ");
            guessednumber = sc.nextInt();

            if (guessednumber > rand_1) {
                System.out.println(" Guessed number is higher than random generated number: ");

            } else if (guessednumber < rand_1) {
                System.out.println(" Guessed number is lower than random generated number: ");

            } else {
                System.out.println("yeeahhhh yo guessed it right the generated number is :" + rand_1);

            }

        }

        sc.close();

    }
}
