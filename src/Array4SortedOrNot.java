import java.util.Scanner;

public class Array4SortedOrNot {
    static  boolean sortedOrNot( int arr[]){
        boolean check = true;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] <= arr[i-1] ){
                check = false;
            }
        }
        return check;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n= sc.nextInt();

        int arr[] = new int[n];
        System.out.println("enter "+n+" elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Entered Array is sorted:  " +  sortedOrNot(arr));
    }
}
