public class AdditionOfTwoMatrix {
    static void printArray(int arr[][]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+", ");
            }
            System.out.println();}
    }
    static  void add(int arr[][],int r1, int c1, int arr2[][],int r2, int c2){
        int sum[][]=new int[r1][c1];
        if(r1!=r2 || c1!=c2){
            System.out.println("wrong Input- Addition not possible");
            return;
        }
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                sum[i][j] = arr[i][j] + arr2[i][j];
            }
        }
        System.out.println("sum of Matrix1 and matrix2 is: ");
        printArray(sum);}
    public static void main(String[] args) {
        int r1=2,c1=2, r2=2, c2=2;
        int arr[][]={{1,2},{3,4}};
        int arr2[][]={{5,6},{7,8}};
        System.out.println("arr Array Elements are: ");
        printArray(arr);
        System.out.println("arr2 Array Elements are: ");
        printArray(arr2);
        add(arr,r1, c1, arr2,r2, c2);
    }
}
