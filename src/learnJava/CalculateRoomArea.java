package learnJava;

import java.util.Scanner;

public class CalculateRoomArea {
    int length=0;
    int breath=0;
    static Scanner sc= new Scanner(System.in);

    public static void main (String []args){
        CalculateRoomArea cal = new CalculateRoomArea();
        fieldOfRectangle(cal);
        System.out.println(cal.calucatePerimeter());
        System.out.println(cal.calculateArea());
        //System.out.println(calculateNew());
    }

    CalculateRoomArea(){

    }
    double getLength(){
        return  length;
    }
    void  setLength(int length){
        this.length=length;
    }
    double getbreath(){
        return breath;
    }
    void setBreath(int breath){
        this.breath=breath;
    }

    public static void fieldOfRectangle(CalculateRoomArea calculateRoomArea){
        System.out.println("Enter Length of rectangle");
        int length=sc.nextInt();//5
        System.out.println("Enter Breath of rectangle");
        int breadth= sc.nextInt();//7
        calculateRoomArea.setBreath(breadth);
        calculateRoomArea.setLength(length);

    }
    public double calucatePerimeter(){
        return (2*length)+(2*breath);
    }
    public double calculateArea(){
        double areaResult=length*breath;
        return areaResult;

    }
    public  double calculateSum(int num1, int num2){
     setLength(num1);
     setBreath(num2);
     return num1+ num2;
    }
}
