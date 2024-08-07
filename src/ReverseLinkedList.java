import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class ReverseLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> ll=new LinkedList<>();
        Collections.addAll(ll, 1,2,3,4,5,6,7,8);

        ListIterator lt=ll.listIterator();
        while (lt.hasNext()){
            System.out.print(lt.next()+", ");
        }
        System.out.println();
        while(lt.hasPrevious()){
            System.out.print(lt.previous()+", ");
        }
    }
}
