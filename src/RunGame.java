import javax.print.DocFlavor;
import java.util.Scanner;
public class RunGame {
    public static void main(String[]args){
      RunGame run= new RunGame();
      run.guessValue();
    }
    public void guessValue(){
        Dice dice = new Dice();//
        int score=0;
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<5;i++){
            System.out.println("Guess the number");
            int guessedByUser= sc.nextInt();//
            int diceNumber= dice.rollDice();
            if(guessedByUser==diceNumber){
                System.out.println("Your guess is correct");
                score=score+1;
            }
            else{
                System.out.println("Your Guess is wrong Dice number is this :"+diceNumber);
            }
        } System.out.println("Your Score is :" +score);
    }
}

