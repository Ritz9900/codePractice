package learnJava;

import java.util.Scanner;

public class Greeting {
    public  static void main (String args[]) {
        System.out.println("Enter name");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        Greeting g= new Greeting();
        g.greetUser(name);
    }
    public  void greetUser(String name){
        System.out.println("Hi there," +name);
    }
}

