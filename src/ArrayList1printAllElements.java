import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;
import java.util.Scanner;

public class ArrayList1printAllElements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, 1,2,3,4,5,6,7);
        for (int i = 0; i < n; i++) {
            arrayList.add(sc.nextInt());
        }
//        ListIterator lt=arrayList.listIterator();
//        while(lt.hasNext()){
//            System.out.println(lt.next());
//        }
//        for (int a: arrayList) {
//            System.out.println(a);
//        }

        for (int i = 0; i < arrayList.size(); i++) {
//
//            if(arrayList.get(i) == 3){
//                continue;
//            }
//            if(arrayList.contains(3)){
//                    arrayList.addAll(arrayList1, 1,2,3,4, 5);
//            }
            System.out.println(arrayList.get(i));
        }

        System.out.println(arrayList);
    }
}
