import java.util.Scanner;

public class MultiDimensionalArray {

    static void printArray(int arr2[][]){
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j]+", ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter Number of rows");
        int r=sc.nextInt();
        System.out.println("enter Number of columns");
        int c=sc.nextInt();
        System.out.println("enter "+r*c+" Elements");
        int arr[][]=new int[r][c];
        for (int i = 0; i <r ; i++) {
            for (int j = 0; j < c ; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("After printing Array elements are: ");
        printArray(arr);
    }
}
