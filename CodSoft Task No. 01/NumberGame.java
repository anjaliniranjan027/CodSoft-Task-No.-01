// NUMBER GAME

//Random is a class for random numbers
import java.util.Random;  

//for taking inputs from the user
import java.util.Scanner; 

  public class NumberGame {
    
   public static void main(String[] args) {
        Random ran = new Random();

        int RandomNumber = ran.nextInt(100) + 1 ;
      
        int trycount = 0;

        while(true) {
            System.out.println("Enter your Guess Number between 1 - 100: ");

            Scanner scanner = new Scanner(System.in);
            int Guess = scanner.nextInt();

            trycount ++;

             if (Guess == RandomNumber) {
                System.out.println("Kudos to you !!! YOU WON");
                System.out.println("It Took " + trycount +  " Attempts");
                break;
             }
             else if (RandomNumber > Guess) {
                System.out.println("Nope! THE NUMBER IS HIGHER");
             }

             else {
                System.out.println("Nope! THE NUMBER IS SMALLER");
                scanner.close();
             }
         }
      }
   }
   