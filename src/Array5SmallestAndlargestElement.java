import java.util.Arrays;
import java.util.Scanner;

public class Array5SmallestAndlargestElement {

    static int[] smallestAndlargestElement(int arr[]){
       Arrays.sort(arr);
       int[] arr2={arr[0], arr[arr.length-1]};
        for (int i = 0; i < arr2.length; i++) {
            System.out.print("Values present at array2 is: "+ arr2[i]+ ", ");
        }
       return  arr2;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter an array length");
        int n= sc.nextInt();


        int arr[] = new int[n];
        System.out.println("enter "+ n + " values");
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
//        System.out.println("enter x value");
//        int x=sc.nextInt();
        System.out.println(smallestAndlargestElement(arr));
    }
}
