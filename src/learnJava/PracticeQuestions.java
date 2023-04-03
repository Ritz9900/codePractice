package learnJava;
import java.sql.SQLOutput;
import java.util.Scanner;
public class PracticeQuestions {
    public static void main(String[] args) {
       /* Scanner sc = new Scanner(System.in);
        boolean agin;//false

        do {
            System.out.println("Enter the num");
            double num1 = sc.nextDouble();
            System.out.println("Enter num2");
            double num2 = sc.nextDouble();
            double sum = num1 + num2;
            System.out.println("Sum is" + sum);//8
            System.out.println("Would u like to over");//yes
            agin = sc.nextBoolean();//true
             } while (agin);
        sc.close();
       */
        PracticeQuestions practiceQuestions = new PracticeQuestions();
        //  practiceQuestions.printOddUpto1000();
        // practiceQuestions.printFirst100Odd();
        // practiceQuestions.printFirst100Even();
        // practiceQuestions.fibonocci();
        // practiceQuestions.forFiboci();
        // practiceQuestions.Forupto1000Odd();
        // System.out.println("Enter number of which you want gabonici");
      //  Scanner sc = new Scanner(System.in);
       // int n = sc.nextInt();//5
        // long factorial = practiceQuestions.getFactorial(n);
        //System.out.println("Factorial is "+ factorial);
        //  long factFor=practiceQuestions.getForFactorial(n);
        // System.out.println("Fcatorial for for method "  +factFor);
        //practiceQuestions.printPatern();
        // practiceQuestions.printForPatern();
        // practiceQuestions.printForReversePatern();
        // practiceQuestions.getFirst10CharctersInAlpahbet();
        //  String input= sc.next();
        //  practiceQuestions.stringManipulation(input);
        //  practiceQuestions.printOddcharPosition();
        //  practiceQuestions.printCharacterIfVovel(input);
        // practiceQuestions.printReverseString(input);
        //  practiceQuestions.printReverseOFString(input);
        //    String reverseString = practiceQuestions.getReverseString(input1);
        // boolean isPalindrome= practiceQuestions.checkPallindrom("Datyu");
        // System.out.println(isPalindrome? "The string is palindrome": "The string is not plaindrome");
     //   String result = practiceQuestions.getResult(n);
      //  System.out.println("Your result is " + result);
        char max=practiceQuestions.getMostRepeatingCharacter("baakaaa");
        System.out.println("max repeating:" + max);
    }

    public void getFirst10CharctersInAlpahbet() {
        char c = 'A';
        for (int i = 0; c < 'Z'; i++) {
            System.out.print(c);
            c = (char) (c + 1);
        }
    }

    public void printOddUpto1000() {
        int num = 1;
        // int count=1;
        while (num <= 1000) {
            if (num % 2 == 1) {
                System.out.println(num);
            }
            num++;
        }
    }

    private void printFirst100Odd() {
        int num = 1;
        int count = 0;
        while (count < 10) {
            System.out.println(num);//3
            num = num + 2;//3
            count++;
        }
    }

    private void printFirst100Even() {
        int count = 0;
        int num = 0;
        while (count < 10) {
            num = num + 2;
            System.out.println(num);
            count++;

        }
    }

    private void fibonocci() {


        int count = 1;
        int fibboci1 = 0;
        int fibboci2 = 1;
        System.out.println(fibboci1);//0
        System.out.println(fibboci2);//1

        while (fibboci2 < 34) {
            fibboci1 = (fibboci1 + fibboci2);//0+1=1,2
            fibboci2 = (fibboci1 + fibboci2);//1+1=2,3
            System.out.println(fibboci1);//1,3
            System.out.println(fibboci2);//x
        }
    }

    private void forFiboci() {
        for (int fib1st = 0, fib2nd = 1; fib2nd <= 34; fib1st = fib1st + fib2nd, fib2nd = fib1st + fib2nd) {
            System.out.println(fib1st);//1,3
            System.out.println(fib2nd);//2,5
        }
    }

    private void Forupto1000Odd() {
        for (int i = 1, count = 0; count < 10; i = i + 2) {

            System.out.println(i);
            count++;
        }

    }

    private long getFactorial(int n) {
        long fact = 1;
        while (n > 0) {//5,4,3,2,1
            fact = fact * n;//5+0,5*4*3*2*1
            n--;//4,3,2,1,0
        }
        return fact;
    }

    private long getForFactorial(int n) {//5
        long fact = 1;
        for (int i = n; i > 0; i--) {
            fact = fact * i;//1*5,5*4*3
        }
        return fact;
    }

    private void printPatern() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number you want print");
        int n = sc.nextInt();
        int i = 0;
        while (i < n) {//n=4,3
            int m = 0;
            //4-0,3-0,2-0,1-0/3-0
            while (m <= i) {//4>0,3>0,2>0/3>0
                System.out.print("*");
                m++;//3,2,1/2
            }
            System.out.println();
            i++;//3
        }
    }

    private void printForPatern() {
        System.out.println("enter number which u want patern");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//4
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    private void printForReversePatern() {

        System.out.println("enter number which u want patern");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//4
        for (int i = 0; i <= n; i++) {//0<4
            for (int j = 0; j < (2 * i - 1); j = j + 1) {//4,4>0
                System.out.print("*");
            }
            System.out.println();
        }

    }

    private char getNextChar(char c) {
        return (char) (c + 1);
    }

    private void patern() {
        System.out.println("enter number of line you want");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//4
        for (int i = 1; i <= n; i++) {
            char c = 'a';
            for (int j = 0; j < i; j++) {
                System.out.print(c);
                c = (char) (c + 1);
            }
            System.out.println();
        }
    }

    private void stringManipulation(String s) {
        System.out.println("Length of string is " + s.length());
        for (int i = 0; i < s.length(); i++) {
            System.out.println("Position: " + i + " Character is " + s.charAt(i));
        }
    }

    private void printOddcharPosition() {
        System.out.println("Enter String");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Length of string " + name.length());
        for (int i = 0; i < name.length(); i = i + 2) {
            System.out.println(name.charAt(i));
        }
    }

    private void printCharacterIfVovel(String str) {
        for (int i = 0; i < str.length(); i++) {//Ritika
            if ((str.charAt(i) == ('a') || str.charAt(i) == ('e') || str.charAt(i) == ('i') || str.charAt(i) == ('o') || str.charAt(i) == ('u'))) {
                System.out.println("Print letter :" + str.charAt(i) + "" + " position" + i);
            }
        }


    }

    private void printReverseString(String str) {
        System.out.println("String enter by you :" + str);
        int n = str.length();//3,RAM
        for (int i = 0; i < n; i++) {//3
            for (int j = 0; j <= i; j++) {
                System.out.print(str.charAt(j));
            }
            System.out.println();
        }
    }

    private void printReverseOFString(String str) {//Ram

        int n = str.length() - 1;//2
        for (int i = n; i >= 0; i--) {//2,0<2
            for (int j = n; j >= i; j--) {//j=2,2>2,1
                System.out.print(str.charAt(j));//ma
            }
            System.out.println();
        }

    }

    private void printReverseOfNumber(int num) {
        System.out.println("enter original number : " + num);//567

        int rev = 0;
        for (int i = num; num > 0; ) {//567,56

            rev = (num % 10) + rev * 10;//7*10+0=70+6*10=130+60=196
            num = num / 10;//56,6

        }
        System.out.println("" + rev);
    }

    private String getReverseString(String string) {//RAM
        System.out.println(string.trim());
        StringBuffer rev = new StringBuffer();
        int slenth = string.length() - 1;
        for (int i = slenth; i >= 0; i--) {
            rev.append(string.charAt(i));
            // System.out.print(rev);
        }
        return rev.toString();
    }

    private boolean checkPallindrom(String str) {//Dalad
        System.out.println("Enter String to check Palindrom : " + str);
        boolean value = false;
        int n = str.length() - 1;//5
        for (int i = 0; i < n; i++) {
            //new=str.toLowerCase();
            if ((str.charAt(i)) == (str.charAt(n - i))) {//d==d
                value = true;
            } else {
                value = false;
            }

        }

        return value;
    }

    private String getResult(int marks) {//45
        String fail = "Fail";
        String gradeD = "Grade D";
        String gradeC = "Grade C";
        String gradeB = "Grade B";
        String gradeBPlus = "Grade B+";
        String gradeA = "Grade A";
        String gradeAPlus = "Grade A+";
        if ((marks > 0) && (marks <= 32)) {
            return fail;
        } else if ((marks >= 33) && (marks <= 45)) {
            return gradeD;
        } else if ((marks >= 46) && (marks <= 60)) {
            return gradeC;
        } else if ((marks >= 61) && (marks <= 75)) {
            return gradeB;
        } else if ((marks >= 76) && (marks <= 85)) {
            return gradeBPlus;
        } else if ((marks >= 86) && (marks <= 95)) {
            return gradeA;
        } else {
            return gradeAPlus;
        }
    }


    private String getRemainingMessage(int number) {
        return "Remainder is" + (number % 3);
    }
  /*  private char getMostRepetingChar(String str){//Ritika
        int length= str.length()-1;//6
        char maxChar= str.charAt(0);
        int maxCount=1;
        for(int i=0;i<=length;i++){//RITIKA
         for (int j=0;j<=length;j++){
             if (str.charAt(i)==str.charAt(j)){
                 count=count+1;
             }
             char
         }
        }
        return maxChar;
    }

   */
    private boolean checkVowel(String str) {//ritik    `
        boolean check=false;
        for (int i = 0; i < str.length(); i++) {

            if ((str.charAt(i) == 'a') || (str.charAt(i) == 'e') || (str.charAt(i) == 'i') || (str.charAt(i) == 'o') || (str.charAt(i) == 'u')) {
                return true;

            } else {
                check=false;
            }

        }
        return check;


    }

    private char getMostRepeatingCharacter(String str){
        char mostRepeatingCharater=0;
        int mostRepeatingCharacterOccurence=0;

        for (int i =0 ; i<str.length()-1; i++){//Ritika
            char currentChar= str.charAt(i);//R,i
            int currentCount=0;
            for (int j=0; j<str.length(); j++){
                if(str.charAt(j)==currentChar){
                    currentCount++;
                }
            }
            if(currentCount>mostRepeatingCharacterOccurence){
                mostRepeatingCharacterOccurence= currentCount;
                mostRepeatingCharater= currentChar;
            }
        }
        return mostRepeatingCharater;
    }
}













