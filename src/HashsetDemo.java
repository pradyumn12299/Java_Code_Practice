import java.util.Collections;
import java.util.HashSet;

public class HashsetDemo {
    public static void main(String[] args) {

        HashSet<Integer> hs=new HashSet<>();
        Collections.addAll(hs, 1,2,3,4,5,6,3,2,null);

        System.out.println(hs);
    }
}
