package learnJava;

import sun.applet.Main;

import java.util.ArrayList;
import java.util.List;

public class Number {
    public static void main(String[]args){
Number number= new Number();
        System.out.println(number.reverseString("Ritika"));
        number.printPattern(4);
        System.out.println( number.maxFrequencyCharater("RITIKA"));

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(9);
        list.add(7);
        list.add(15);
        list.add(14);
        list.add(12);
        new Number().getWithMaxValue(list);
    }
    public boolean checkNumberDivisibleBY5 (int num1){
        if(num1%5==0) {
            return true;
        }
        else {
            return false;
        }
    }
    // reverse a string
    public String reverseString(String str){//Ritika
         int length= str.length()-1;
         StringBuffer rev=new StringBuffer();
        for (int i=length;i>=0;i--){
            rev= rev.append(str.charAt(i));//a
        }
        return rev.toString();
    }
    //Pattern
    public void printPattern(int num1){//4
        for(int i=1;i<=num1;i++){
            for (int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    // given a list of integers, find the integer with max value

    public int getWithMaxValue(List<Integer> integerList){
        int maxValue= integerList.get(0);
        for (int i =0 ; i<integerList.size()-1; i++){
            if(integerList.get(i)>maxValue){
                maxValue= integerList.get(i);
            }
        }
        return maxValue;
    }

    public int getWithMaxValueArray(int[] integerArray){
        return 2;
    }
    // given a string find the character with maximum frequency
    public char maxFrequencyCharater(String str){
        char maxOccured=str.charAt(0);
        int maxOccur=1;
        for (int i=0; i<str.length()-1;i++){
            int currentOccur= 1;
            for (int j=i+1; j<str.length()-1; j++ ) {
                if (str.charAt(i) == str.charAt(j)) {
                    currentOccur = currentOccur+1;
                }
            }
            if (currentOccur>maxOccur){
                maxOccur= currentOccur;
                maxOccured= str.charAt(i);
            }
        }
        return maxOccured ;
    }
    // given a list of string return thr first element of the list
    // given a list of string return the string with maximum length

}
