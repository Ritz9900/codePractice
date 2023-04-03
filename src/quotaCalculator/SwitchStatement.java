package quotaCalculator;

import java.util.Scanner;

// User entering grade
// have to print how they did
public class SwitchStatement {
    public  static void main(String[]args){
        System.out.println("Enter Grade you Scored ");
        Scanner sc= new Scanner(System.in);
        String grade= sc.next();
        String message;

        switch (grade){
            case "A":
                message="Excellent JOb";
                break;
        }
        switch (grade){
            case "B":
                message="Good Job";
                break;
        }
        switch (grade){
            case "C":
        }

    }
}
