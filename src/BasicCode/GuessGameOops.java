package BasicCode;

import java.util.Scanner;
import java.util.Random;

class Game{

    public int compInput;
    public int userInput;
    public int noOfGuesses = 0;

//    public int getNoOfGuesses() {
//        return noOfGuesses;
//    }

    public void setNoOfGuesses() {
        this.noOfGuesses++;
    }

    public Game() {     //constructor to generate random number
        Random rand = new Random();
        this.compInput = rand.nextInt(100);
    }


    void takeUserInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Guess the Number (between 1 and 100) : ");
        this.userInput = sc.nextInt();
    }

    boolean isCorrectNumber(){
       noOfGuesses++;
       // setNoOfGuesses();
      if(userInput == compInput){
          System.out.println("You Guessed the number "+userInput+" right in "+noOfGuesses+" attempts");
          return true;
      }
      else if(userInput < compInput){
          System.out.println("Too small ...");
      }
      else if(userInput > compInput){
          System.out.println("Too Large ...");
      }
          return false;

    }
}

public class GuessGameOops {
    public static void main(String[] args) {

        Game ob = new Game();
        boolean b = false;
        while(!b){
            ob.takeUserInput();
            b = ob.isCorrectNumber();
           // System.out.println(b);
        }


    }
}
