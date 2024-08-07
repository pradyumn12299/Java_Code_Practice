public class MultiplicationOfMatrix {
    static void printArray(int arr[][]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+", ");}
            System.out.println();}
    }
    static void multiplication(int arr[][],int r1,int c1, int arr2[][],int r2, int c2){
        if(c1!=r2){
            System.out.println("wrong Input - Multiplication is not possible");
            return;
        }
        int ans[][]=new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    ans[i][j] += (arr[i][k] * arr2[k][j]);}}}
        System.out.println("Multiplication Of two Matrices are: ");
        printArray(ans);
    }
    public static void main(String[] args) {
        int r1=2, c1=3, r2=3,c2=2;
        int arr[][]={{1,2,1},{3,1,2}};
        int arr2[][]={{2,1},{1,3},{1,1}};
        System.out.println("arr Array Values are:");
        printArray(arr);
        System.out.println("arr2 Array Values are: ");
        printArray(arr2);
        multiplication(arr,r1,c1,arr2,r2,c2);

    }
}
