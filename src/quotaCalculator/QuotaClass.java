package quotaCalculator;

import java.util.Scanner;
// Question calculate total sales made by seller
// All have to make atlaest 10 sales if sales<10 print by how many they are short
// If sales >10 print congratulation message


public class QuotaClass {
    public  static void main (String[]args){
        int quota=10;

        System.out.println("Enter the number of sales you made this week");
        Scanner sc= new Scanner(System.in);
        int salesValue=sc.nextInt();
        if (salesValue>quota){
            System.out.println("Congatulation You have done good job");
        }
        else {
            int shortSalesValue = quota-salesValue;
            System.out.println("You have made total sales :"+salesValue+"And you are short by"+shortSalesValue);
        }
    }
}
