public class Calculate_Sum_Of_Element_Present_In_Array {

    void sumOfArrayIs(){
        int arr[]= {1,4,5,6,1};
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Calculate_Sum_Of_Element_Present_In_Array obj=new Calculate_Sum_Of_Element_Present_In_Array();
        obj.sumOfArrayIs();
    }
}
