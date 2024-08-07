import java.util.HashSet;

public class UnionOfArray {
    public static void main(String[] args) {
        int arr1[] ={7,3,9};
        int arr2[] = {6,3,9,2,9,4};


//        HashSet<Integer> set=new HashSet<>();
//        for (int i = 0; i < arr1.length; i++) {
//            set.add(arr1[i]);
//        }
//        for (int i = 0; i < arr2.length; i++) {
//            set.add(arr2[i]);
//        }
//        int count=0;
//        for (int key: set) {
//            count++;
//        }
//        System.out.println(count);


        System.out.println(Union(arr1,arr2));
    }

    public static int Union(int arr1[], int arr2[]){
        HashSet<Integer> set=new HashSet<>();
        int n= arr1.length;
        int n1= arr2.length;

        for (int i = 0; i < n; i++) {
            set.add(arr1[i]);
        }
        for (int i = 0; i < n1; i++) {
            set.add(arr2[i]);
        }
        return set.size();
    }
}
