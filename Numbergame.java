import java.util.Random;
import java.util.Scanner;

public class Numbergame {
    private static final int Maximum_Attempts = 10;
    private static final int Minimum_Range = 1;
    private static final int Maximum_Range = 100;
    private static final int Maximum_Rounds =4;
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();
        System.out.println("Welcome to Guess the Number Game");
        int totalscore=0;
        for(int round =1 ;round<=Maximum_Rounds;round++){
            System.out.println("Round "+round+"of "+Maximum_Rounds);
            int numberToGess = random.nextInt(Maximum_Range-Minimum_Range+1)+Minimum_Range;
            int attempts = 0;
            boolean isGuessedCorrectly = false;
            System.out.println("Guess the Number between "+ Maximum_Range +" to"+Minimum_Range+":");
            while (attempts<Maximum_Attempts && !isGuessedCorrectly){
                attempts++;
                System.out.println("Attempt "+attempts+" :");
                int userGuess = scanner.nextInt();
                if (userGuess<Minimum_Range || userGuess>Maximum_Range){
                    System.out.println("Please enter number between "+Minimum_Range+"and "+Maximum_Range);

                } else if (userGuess<numberToGess) {
                    System.out.println("Number is Low! Try again");
                } else if (userGuess>numberToGess) {
                    System.out.println("Number is high! Try again");

                }else {
                    isGuessedCorrectly=true;
                    int score=Math.max(0,Maximum_Attempts-attempts+1);
                    totalscore+=score;
                    System.out.println("Congratulations! You Guessed the number in "+attempts+" attempts.");
                    System.out.println("You scored  "+score+" Point this round.");

                }
            }
            if(!isGuessedCorrectly){
                System.out.println("Sorry,you've used all the attempts. The number was"+numberToGess+".");
            }
            System.out.println("Total score so far: "+totalscore+"/n");

        }
        System.out.println("Game Over! Your Final score is "+totalscore+".");
        scanner.close();
    }




}
