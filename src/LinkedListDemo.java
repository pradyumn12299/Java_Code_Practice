import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList=new LinkedList<Integer>();
        Collections.addAll(linkedList, 1, 2, 3, 4, 5);
        System.out.println(linkedList);
        for(int a : linkedList){
            System.out.println(a);
        }
        ListIterator lt=linkedList.listIterator();
        while (lt.hasNext()){
            System.out.print(lt.next()+",");
        }
    }
}
