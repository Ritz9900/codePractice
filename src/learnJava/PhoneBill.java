package learnJava;

import java.util.Scanner;

public class PhoneBill {

    int phoneId;
    int baseCost;
    int allotedMinutes;
    int minutesUsed;

    public PhoneBill(){
        phoneId=0;
        baseCost=79;
        allotedMinutes=600;
        minutesUsed=700;
    }
    public PhoneBill(int id){
        this.phoneId=id;
        baseCost=79;
        allotedMinutes=600;
        minutesUsed=700;
    }
    public PhoneBill(int phoneId,int baseCost,
        int allotedMinutes,int minutesUsed){
        this.phoneId=phoneId;
        this.baseCost=baseCost;
        this.allotedMinutes=allotedMinutes;
        this.minutesUsed=minutesUsed;
    }

    public int getPhoneId() {
        return phoneId;
    }

    public void setPhoneId(int phoneId) {
        this.phoneId = phoneId;
    }

    public int getBaseCost() {
        return baseCost;
    }

    public void setBaseCost(int baseCost) {
        this.baseCost = baseCost;
    }

    public int getAllotedMinutes() {
        return allotedMinutes;
    }

    public void setAllotedMinutes(int allotedMinutes) {
        this.allotedMinutes = allotedMinutes;
    }

    public int getMinutesUsed() {
        return minutesUsed;
    }

    public void setMinutesUsed(int minutesUsed) {
        this.minutesUsed = minutesUsed;
    }

    public static void main (String [] args){
 PhoneBill phoneBill= new PhoneBill();

                 phoneBill.setMinutesUsed(1000);
    phoneBill.totalPhoneBill();

    }
    public double calculateTax(){
        double taxRate=0.15;
        return taxRate*(baseCost+calculateoverage());

    }
    public int totalPhoneBill(){
        return (int) (baseCost+calculateoverage()+calculateTax());
    }
    public int calculateoverage(){
        if (minutesUsed<=allotedMinutes){
            return 0;
        }
        double overageRate=0.25;
        double overageMinutes= minutesUsed-allotedMinutes;
        return (int) (overageMinutes*overageRate);

    }

}
