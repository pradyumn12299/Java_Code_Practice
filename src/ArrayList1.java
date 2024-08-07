import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList1 {
    public static void main(String[] args) {
        List<Integer> l1= new ArrayList<Integer>();
        l1.add(12);
        l1.add(13);
        Collections.addAll(l1, 1,2,3,4,5,6,7,8);
        System.out.println(l1.get(1));
        Integer integer = l1
                .stream()
                .max((i1, i2) -> i1.compareTo(i2))
                .get();


       // System.out.println("Max value is : "+ integer);
    }
}
