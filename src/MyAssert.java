public class MyAssert {

    public static void equals(int a, int b, String exceptionMessage) throws Exception {
        if (a!=b){
            throw new Exception(exceptionMessage);
        }
    }
}
