import sun.jvm.hotspot.utilities.Assert;

import java.util.ArrayList;

public class RunBuyerDetail {
    public static void main(String[]args) throws Exception{
        RunBuyerDetail runBuyerDetail=new RunBuyerDetail();
        int resultTestCase1 = runBuyerDetail.divideNumber(10,2);
        int resultTestCase2 = runBuyerDetail.divideNumber(50,2);
        int resultTestCase3 = runBuyerDetail.divideNumber(10,3);
        //int resultTestCase4 = runBuyerDetail.divideNumber(10,0);
        MyAssert.equals(resultTestCase1, 5, "Test Case 1 failed");
        MyAssert.equals(resultTestCase2, 25, "Test Case 2 failed");
        MyAssert.equals(resultTestCase3, 4, "Test Case 3 failed");
        //MyAssert.equals(resultTestCase1, 5, "Test Case 1 failed");

        //ArrayList<BuyerDetail> details=runBuyerDetail.setDetails();
    }
    public ArrayList<BuyerDetail> setDetails(){
        BuyerDetail firstDetail=new BuyerDetail
                ("Ritika","9900298995","Electronics goods",550);
        BuyerDetail secondDetail=new BuyerDetail("Sohan","7411752995","Television",200);
        BuyerDetail thirdDetail=new BuyerDetail("Mohan","8899889988","Mobile",4000);
        BuyerDetail forthDetail=new BuyerDetail("Raja","666665555","Laptop",2500);
        BuyerDetail fifthDetail=new BuyerDetail("Mohan","7878788788","Toys",2300);
        ArrayList<BuyerDetail> setDetail=new ArrayList<>();
        setDetail.add(firstDetail);
        setDetail.add(secondDetail);
        setDetail.add(thirdDetail);
        setDetail.add(forthDetail);
        setDetail.add(fifthDetail);
        return setDetail;
    }
    public int divideNumber(int a, int b){
        try {
            int result = a / b;
            return result;
        }catch(ArithmeticException e){
            e.printStackTrace();
            System.out.println("Something wrong happened");
            return 0;
        }
    }
}
