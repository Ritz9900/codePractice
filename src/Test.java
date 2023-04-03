public class Test {

    public static void main(String[] args){
        Test obj= new Test();
        int sum= obj.sumTwoNum(5,7);
        System.out.println("Summation of two number is" +sum);
        boolean result= obj.identifyNumber(5);
        System.out.println("Provided Number is  :" +result);

    }

    public int sumTwoNum(int a, int b)
    {
        int sum= a+b;
        return sum;
    }
    public boolean identifyNumber(int num)//6
    {
        if(num%2==1)//odd
        {
            return true;
        }
        else
        {
            return false;
        }

    }
}
