package learnJava;

import java.util.Scanner;

public class Cashier {
    public static void main(String[]args){
        System.out.println("Enter some text");
        Scanner sc= new Scanner(System.in);
        String text= sc.next();
        sc.close();

        boolean letterFound= false;
        for(int i=0;i<text.length();i++){
            char currentletter=text.charAt(i);
            if(currentletter=='a'||currentletter=='A'){
                letterFound=true;
                break;
            }
        }
        if(letterFound){
            System.out.println("This text contain 'A");
        }
        else {
            System.out.println("letter not present");
        }

    }
}
