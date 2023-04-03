package quotaCalculator;

import java.util.Scanner;

public class QualifyForLoanCalculation {
    // person must have $30,000
    // Must working in current job for 2 yrs
    public  static void main(String[]args){
        double requiredSalary=30000;
        int requiredYearEmpoyee=2;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Your Salary");
        double employSalary=sc.nextDouble();
        System.out.println("Enter number of year you are current employer ");
        double year= sc.nextDouble();


        if(employSalary>=requiredSalary){
            if(year>=requiredYearEmpoyee){
                System.out.println("Congratulation you qualify For Loan");
            }
            else {
                System.out.println("Soory You have not much working experience in current job"+requiredYearEmpoyee);
            }
        }
        else {
                System.out.println("Sorry You have not Have Required Salary for loan approval "+requiredSalary);
        }

    }
}
