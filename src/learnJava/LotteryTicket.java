package learnJava;

import java.lang.reflect.Array;
import java.util.Random;

public class LotteryTicket {
    private static final int LENGTH=6;
    private static final int MAX_TICKET_NUMBER=69;

    public static int[] generateNumbers(){
        int [] ticket= new int[LENGTH];
        Random random= new Random();
        for(int i=0;i<6;i++){
        ticket[i]=random.nextInt(MAX_TICKET_NUMBER)+1;
}return ticket;
    }

    public static void PrintTicket(int[] ticket) {
        for (int i = 0; i < LENGTH; i++) {
            System.out.print(ticket[i]+"|");
        }
    }
        public static void main (String[]args){
            int[] ticket = generateNumbers();
            PrintTicket(ticket);
        }


}
