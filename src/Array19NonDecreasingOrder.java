import java.util.Scanner;

public class Array19NonDecreasingOrder {

    static void printArray(int ans[]) {
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + ", ");
        }
        System.out.println();
    }

    static int[] sortSquares(int arr[]){
        int n= arr.length;
        int count=0, left=0,right=n-1;
        int ans[]=new int[n];
        while(left<=right){
            if(Math.abs(arr[left]) > Math.abs(arr[right])){
                ans[count++]=arr[left]*arr[left];
                left++;
            }
            else{
                ans[count++]=arr[right]*arr[right];
                right--;
            }
        }
        return  ans;
    }

//    static int[] reverseArray(int ans[]){
//        int n= ans.length;
//        int[] arr2=new int[n];
//        int j=0;
//        for (int i = ans.length-1; i >= 0 ; i--) {
//            arr2[j++]=ans[i];
//            //System.out.println(ans);
//
//        }
//        return arr2;
//    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of an array");
        int n=sc.nextInt();

        int arr[]=new int[n];
        System.out.println("enter the elements in the array");
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }


        System.out.print("original array is:  ");
        printArray(arr);
        System.out.print("array After sqaure function:   ");
        int ans[]=sortSquares(arr);
        printArray(ans);
//        System.out.print("array after reverse is:  ");
//        reverseArray(ans);
//        printArray(ans);
    }
}
