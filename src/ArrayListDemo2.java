import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        Collections.addAll(al, 1,2,3,4,5,6,7,8,9);
        System.out.println(al);

        //to get elements
        int element=al.get(3);
        System.out.println(element);
        al.add(3, 14);
        int element1=al.get(3);
        System.out.println(al);
        System.out.println(element1);
        al.set(0, 10);
        System.out.println(al);
        al.remove(3);
        System.out.println(al);
        int sixe=al.size();
        System.out.println(sixe);
        for (int i = 0; i < al.size(); i++) {
            System.out.print(al.get(i)+", ");
        }
        System.out.println();
        Collections.sort(al);
        System.out.println(al);
    }
}



























