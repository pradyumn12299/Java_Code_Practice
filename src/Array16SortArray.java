import java.util.Scanner;

public class Array16SortArray {

    static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+", ");
        }
        System.out.println();
    }

    static  void sortZerosAndOnes(int arr[]){
        int zeros=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0){
                zeros++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(i < zeros ){
                arr[i]=0;
            }
            else{
                arr[i]=1;
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
        sortZerosAndOnes(arr);
        System.out.println("sorted array: ");
        printArray(arr);

    }
}
