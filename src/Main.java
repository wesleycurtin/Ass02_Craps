import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        boolean playAgain = true;
        do {
            Random rnd = new Random();
            Scanner in = new Scanner(System.in);

            int die1 = rnd.nextInt(6) + 1;
            int die2 = rnd.nextInt(6) + 1;
            int crapsRoll = die1 + die2;
            int point = 0;
            boolean done = false;
            int newDie1 = rnd.nextInt(6) + 1;
            int newDie2 = rnd.nextInt(6) + 1;
            int crapsRoll2 = newDie1 + newDie2;


            System.out.println("You rolled a " + die1 + " on your first die");
            System.out.println("You rolled a " + die2 + " on your second die");

            do {
                if (crapsRoll == 2 | crapsRoll == 3 | crapsRoll == 12) {
                    System.out.println("You got a " + crapsRoll + "! Unfortunately you crapped out!");
                    done = true;
                } else if (crapsRoll == 7 | crapsRoll == 11) {
                    System.out.println("You got a " + crapsRoll + "! Congratulations you got a natural");
                    done = true;
                } else {
                    point = crapsRoll;
                    System.out.println("Your first roll " + crapsRoll + " is now the point");
                    do {
                        newDie1 = rnd.nextInt(6) + 1;
                        newDie2 = rnd.nextInt(6) + 1;
                        crapsRoll2 = newDie1 + newDie2;
                        System.out.println("You rolled a " + crapsRoll2);
                        if (crapsRoll2 == point) {
                            System.out.println("You matched the point! Congratulations you win!");
                            break;

                        }
                        if (crapsRoll2 == 7) {
                            System.out.println("You rolled a 7! Sorry you lose!");
                            break;
                        }
                        done = true;
                    } while (crapsRoll != 7 | crapsRoll2 != point);


                }
            } while (!done);

            System.out.print("Would you like to play again? [Y/N]: ");
            String answer = in.nextLine();
            playAgain = answer.equalsIgnoreCase("y");

        }while(playAgain);









    }
}