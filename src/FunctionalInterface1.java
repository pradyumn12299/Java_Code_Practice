import java.util.function.Function;

public class FunctionalInterface1 {
    public static void main(String[] args) {
        Function<String, Integer> i=s->s.length();
        System.out.println(i.apply("pradyumn"));
    }
}
