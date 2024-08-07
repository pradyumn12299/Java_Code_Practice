import java.util.HashMap;
import java.util.Map;

public class HashMapDemo2 {
    public static void main(String[] args) {
        HashMap<String, Integer> map=new HashMap<>();

        //Insertion Operation
        map.put("India", 120);
        map.put("Us", 30);
        map.put("China", 150);

        //update
        map.put("China", 180);
        System.out.println(map);

        //search
        if(map.containsKey("indiaa")){
            System.out.println("present");
        }else System.out.println("absent");

        //to print values
        System.out.println(map.get("China"));
        System.out.println(map.get("in"));

       for (Map.Entry<String, Integer> e : map.entrySet()){
           System.out.print(e.getKey()+", ");
           System.out.print(e.getValue());
           System.out.println();
       }

        System.out.println(map.remove("China"));
        System.out.println(map);
    }
}
