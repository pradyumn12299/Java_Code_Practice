import java.util.Scanner;

public class Array6ArraySumOfTwoPair {
    static void pairsum(int arr[], int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]+arr[j] == target){
                    System.out.println("printing the value of: "+ arr[i] +", " +arr[j]);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter length of an array");
        int n=sc.nextInt();

        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
        System.out.println("enter taget value");
        int target=sc.nextInt();

        pairsum(arr, target);
    }
}
