import java.util.Scanner;

public class LinearSearch {
    public static void searchingElement(int[] arr, int searchElement){
        int count=0, indexValue=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == searchElement){
                count++;
                indexValue=i;
            }
        }
        if(count >= 1){
            System.out.println("element present at index: " + indexValue);
        }
        else{
            System.out.println("element not found in array");
        }
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
        System.out.println("enter x value");
        int searchElement= sc.nextInt();

        searchingElement(arr, searchElement);

    }
}
