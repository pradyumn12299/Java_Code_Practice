import java.util.Scanner;

public class Array14RotateArrayKTimes {

    static void printArray(int ans[]){
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+", ");
        }
        System.out.println();
    }

    static int[] rotateArray(int arr[], int k){
        int n= arr.length;
        k=k%n;
        int ans[]= new int[n];
        int j=0;
        for (int i = n-k; i < n; i++) {
            ans[j++]=arr[i] ;
        }

        for (int i = 0; i < n-k; i++) {
            ans[j++]=arr[i];
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of an array");
        int n=sc.nextInt();

        int arr[]=new int[n];
        System.out.println("enter the elements in an array");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }

        System.out.println("enter the Kth Element");
        int k=sc.nextInt();
        System.out.println("Original Array is: ");


        System.out.println(rotateArray(arr, k));
        System.out.print("rotational Array is: " );
        int ans[] = rotateArray(arr, k);
        printArray(ans);
    }


}
