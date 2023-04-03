package quotaCalculator;

import java.util.Scanner;

public class PathTestUsingIFElSEIF {
    public  static void main (String[]args){
        // get test score from user
        System.out.println("Enter Your score");
        Scanner sc= new Scanner(System.in);
        double scoredNumber=sc.nextDouble();
        char grade;
        if (scoredNumber<60){
            grade='F';
        }
        else if(scoredNumber<70){
            grade='D';
        }
        else if(scoredNumber<80){
            grade='C';
        }
        else if(scoredNumber<90){
            grade='B';
        }
        else{
            grade='A';
        }
        System.out.println("Your scored Grade is :" +grade);
        }

    }


