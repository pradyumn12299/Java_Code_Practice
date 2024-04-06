public class Array11SwapTwoValues {

    static void swap(int a, int b){
//        Using Temporary Values
//        int temp=a;
//        a=b;
//        b=temp;

//        another method

//        Using sum
            b=a+b;
            a=b-a;
            b=b-a;
        System.out.println("After swap values are: "+ a +", "+ b);
    }

    public static void main(String[] args) {
        int a=10, b=20;
        System.out.println("before swap values are: "+ a +", "+ b);
        swap(a,b);

    }
}
