package learnJava;

import java.sql.SQLOutput;
import java.util.Scanner;

public class GradeMessage {
    public static void main(String args[]){
        System.out.println("Enter your letter grade");
        Scanner scanner= new Scanner(System.in);
        String grade= scanner.next();
        String message;
        switch (grade) {
            case "A":
                message = "Excellent job";
                break;

            case "B":
                message = "Great job";
                break;
            case "c":
                message = "Good Job";
                break;
            case "D":
                message = "You need to work heard";
                break;
            case "F":
                message = "UH oh";
                break;
            default:
                message = "Error.Invalid grade";
                break;

        }
        System.out.println(message);
    }
}
