import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> hm=new HashMap<>();
        hm.put(1,"sachin");
        hm.put(1,"pramod");
        hm.put(2, "nitin");
        hm.put(3, "nagesh");
        hm.put(6, "nagesh");
        //System.out.println(hm);
        for (Map.Entry<Integer, String > name : hm.entrySet()){
            System.out.println(name.getKey() + ", "+ name.getValue());
        }
    }
}
