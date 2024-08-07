import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ReverseArrayList {
    static void reverseArrayList(ArrayList<Integer> list){
        int i=0, j=list.size()-1;
        while (i<j){
            Integer temp=Integer.valueOf(list.get(i));
            list.set(i, list.get(j));
            list.set(j, temp);
            i++;
            j--;

        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        Collections.addAll(list, 1,2,3,4,5,6);
        System.out.println("original Elements are: "+list);
        reverseArrayList(list);
        System.out.println("reverse ArrayList is: "+list);

    }
}
