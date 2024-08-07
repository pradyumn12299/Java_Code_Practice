import java.util.*;
import java.util.stream.*;

public class Lambda {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
//        Collections.addAll(al,1,2,3,4,5,6,7,8,9,10);
//        System.out.println(al);
        IntStream.range(0, 10).forEach(i-> al.add(i));

        //filter method
//        System.out.println("filter and for-each-method");
//       al.stream().filter(i-> i%2==0).forEach(System.out::print);
//       //foreach method
//        System.out.println();
//        System.out.println("for-each-method");
//        al.stream().forEach(System.out::print);
          al.stream().filter(i->i%2==0).map(i->i*10).forEach(i-> System.out.println(i));
        List<Integer> newArraylist= al.stream().filter(i->i%2==0).map(i->i*10).collect(Collectors.toList());
        System.out.println(newArraylist);
    }
}
