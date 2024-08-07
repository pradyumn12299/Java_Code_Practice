import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo2 {
    public static void main(String[] args) {
        HashSet<Integer> hs=new HashSet<>();
        hs.add(1);
        hs.add(2);
        Collections.addAll(hs, 3,4,5,6,7,8);
        System.out.println("size is: "+ hs.size());
        if(hs.contains(1)){
            System.out.println("present element 1");
        }
        if(!hs.contains(12)){
            System.out.println("Element is not present 12");
        }
        boolean b=hs.remove(8);
        if(!hs.contains(8)){
            System.out.println("Element is not present 8");
        }

        System.out.println(hs);
        System.out.println("iterated values are: ");
        Iterator it=hs.iterator();
        while (it.hasNext()){
            System.out.print(it.next()+", ");
        }

    }
}
