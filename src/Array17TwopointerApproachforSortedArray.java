import java.util.Arrays;
import java.util.Scanner;

public class Array17TwopointerApproachforSortedArray {


    static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+", ");
        }
        System.out.println();
    }

    static void swap(int arr[], int i, int j){
        int temp=0;
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void SortedArray(int arr[]){
        int n= arr.length;
        int right=n-1;
        int left= 0;
        while (left<right){
            if(arr[left] == 1 && arr[right]==0){
                swap(arr, left,right);
                left++;
                right--;
            }
            else{
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter length of an array");
        int n= sc.nextInt();

        int arr[] = new int[n];
        System.out.println("enter the Elements in the array");
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }

        System.out.println("original Array is: ");
        printArray(arr);
        SortedArray(arr);
        System.out.println("sorted array: ");
        printArray(arr);

    }
}
