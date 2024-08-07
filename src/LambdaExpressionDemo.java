public class LambdaExpressionDemo implements FunctInt{

    public static void main(String[] args) {
        FunctInt ob=(a,b)-> a+b ;
        int x=ob.add(7,8);
        System.out.println(x);
    }
    @Override
    public int add(int a, int b) {
        return 0;
    }
}


interface FunctInt{
    public int add(int a, int b);
}