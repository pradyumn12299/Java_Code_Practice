import java.util.Scanner;

public class Array7TripletsSums {

    static  int tripletSum(int arr[], int target){
        int n=arr.length;
        int ans=0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == target) {
                        ans++;
                        System.out.println("the elements are: " + arr[i] + ", " + arr[j] + ", " + arr[k]);
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length of an array");
        int n=sc.nextInt();

        int arr[]=new int[n];
        System.out.println("enter n values");
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
        System.out.println("enter target sum ");
        int target= sc.nextInt();

        System.out.println(tripletSum(arr, target));
    }
}
