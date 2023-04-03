package learnJava;


import java.util.Scanner;

public class CalculateSalary {
    public static void main(String args[]){
        int rate=15;
        int maxHours=40;

        System.out.println("How Many hours did you work this week");
        Scanner sc= new Scanner(System.in);
        double hoursWorked=sc.nextDouble();

        while (hoursWorked>maxHours || hoursWorked<1){
            System.out.println("Invalid entry." +
                    " Yours hours must be between" +
                    " 1to 40.Try again");
            hoursWorked=sc.nextDouble();
        }

sc.close();
        double gross=rate*hoursWorked;
        System.out.println("Gross pay:"+ gross);
    }
}
