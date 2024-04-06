import java.util.Scanner;

public class Array12ReverseAnArray {
    static  void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+",");
        }
        System.out.println();
    }
    static int[] reverseArray(int arr[]){
        int n= arr.length;
        int[] ans=new int[n];
        int j=0;
        for (int i = arr.length-1; i >= 0 ; i--) {
            ans[j++]=arr[i];
            //System.out.println(ans);

        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length of an array");
        int n= sc.nextInt();

        int arr[]=new int[n];
        System.out.println("enter the Array Elements");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }

        System.out.println("reveres array is: "+ reverseArray(arr));
        printArray(arr);
    }
}
