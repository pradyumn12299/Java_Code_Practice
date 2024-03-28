import java.util.Scanner;

public class Array2FindLastIndex {

    static int lastIndexofOccuredElementIs(int arr[], int x){
        int lastindex=-1;
        for (int i = 0; i < arr.length; i++) {
            if( arr[i] == x){
                lastindex = i;
            }
        }
        return lastindex;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of an array");
        int n= sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter "+n+" elements");
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter x value ");
        int x= sc.nextInt();

        System.out.println("last index value is: "+ lastIndexofOccuredElementIs(arr , x));

    }
}
