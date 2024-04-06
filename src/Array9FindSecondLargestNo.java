import java.util.Scanner;

public class Array9FindSecondLargestNo {

    static  int findmax(int arr[]){
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
//        System.out.println("max value is: "+ max);
        return max;
    }
    static int secondLargestNo(int arr[]){
        int maxi = findmax(arr);
        for (int i = 0; i < arr.length; i++) {
          if(arr[i] == maxi){
              arr[i] = Integer.MIN_VALUE;
          }
        }
        int secondMax=findmax(arr);
       // System.out.println("second max element is: "+secondMax);
        return secondMax;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of an array");
        int n=sc.nextInt();

        int arr[]=new int[n];
        System.out.println("Enter the elements");
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }

//        System.out.println("enter taget value");
//        int target=sc.nextInt();

        System.out.println("Second max Element: "+ secondLargestNo(arr));

    }
}
