import java.util.function.Predicate;

public class Test {
    public static void main(String[] args) {
        Predicate<Integer> pi=I->I>50;
        Predicate<String> si=S->S.length()>5;
        System.out.println(pi.test(10));
        System.out.println(si.test("pradyumn"));
    }
}
