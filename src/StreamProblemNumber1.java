import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamProblemNumber1 {
    public static void main(String[] args) {
        ArrayList<Integer> l1=new ArrayList<>(Arrays.asList(10,20,30,40,50));
        System.out.println(l1);

        //wap to show greater than 20 value
        List<Integer> collect =l1.stream().filter(i->i>20).collect(Collectors.toList());
        System.out.println(collect);

        //wap to take out final list with where we are adding 5 to each elements
        List<Integer> collect2=l1.stream().map(i->i+5).collect(Collectors.toList());
        System.out.println(collect2);

        //count
        long count=  l1.stream().filter(i->i>=5).count();
        System.out.println("count is: " + count);

        //Min
        int min1=l1.stream().min((i1,i2)-> i1.compareTo(i2)).get();
        System.out.println("minimun value is : "+ min1);

        int max1= l1.stream().max((i1,i2)-> i1.compareTo(i2)).get();
        System.out.println("max value is : "+ max1);

        System.out.print("printing All the Elements : ");
        l1.stream().forEach(System.out::println );























    }
}
