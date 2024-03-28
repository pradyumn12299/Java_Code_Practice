import java.util.Scanner;

public class Array1FindReoccuringvalues {

    static  int countOccurance(int arr[], int x){
        int count=0;
        for(int i=0;i< arr.length; i++){
            if (arr[i] == x){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n=sc.nextInt();

        int arr[]= new int[n];
        System.out.println("Enter " + n + " numbers");
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter x values");
        int x=sc.nextInt();

        System.out.println("count of x is : "+ countOccurance(arr, x));
    }
}
