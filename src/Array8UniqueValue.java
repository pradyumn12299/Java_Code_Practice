import java.util.Scanner;

public class Array8UniqueValue {

    static int findUniqueValues( int arr[],int uniqueValue){
        int ans=-1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] == arr[j])
                {
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > 0){
                ans = arr[i];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length of an array");
        int n=sc.nextInt();

        int arr[]=new int[n];
        System.out.println("enter "+ n + " values");
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
        System.out.println("enter uniquevalue of an array");
        int uniquevalue= sc.nextInt();

        System.out.println("Unique element is:  "+findUniqueValues(arr, uniquevalue));
    }
}
