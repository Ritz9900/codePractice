public class Addition<T> {
    T a;
    T b;

    public void initAddition(T monu, T shonu) {
        a = monu;//1 int sum=a+b;
        b = shonu;//2
    }

    public T getA() {
        return a;
    }

    public void setA(T a) {
        this.a = a;
    }

    public T getB() {
        return b;
    }

    public void setB(T b) {
        this.b = b;
    }

    public T add (){
        T output = null;
        if(a instanceof  String){
            output= (T) ((String) a).concat((String)b);

        }else if(a instanceof  Integer){
            int result = (Integer) a + (Integer) b;
            output= (T) String.valueOf(result);
        }
        return output;
    }
}
