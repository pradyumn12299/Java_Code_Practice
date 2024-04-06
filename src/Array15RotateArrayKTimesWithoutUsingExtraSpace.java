import java.util.Scanner;

public class Array15RotateArrayKTimesWithoutUsingExtraSpace {

    static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+", ");
        }
        System.out.println();
    }

    static void swap( int arr[], int i, int j){
        int temp=0;
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }

    static void reverse(int arr[], int i, int j){
        while (i<j){
            swap(arr, i, j);
            i++;
            j--;
        }


    }

    static void rorateInPlace(int arr[], int k){
        int n= arr.length;
        k=k%n;
        reverse(arr, 0, n-k-1);
        reverse( arr, n-k, n-1);
        reverse(arr, 0, n-1);
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

        rorateInPlace(arr, k);
        System.out.print("Array After rotation is:  ");
        printArray(arr);

    }
}
