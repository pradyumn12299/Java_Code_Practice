class multiply{
    public int multiply( int a, int b){
        return a*b;
    }
    public double multiply(double a, double b){
        return a*b;
    }
}
public class PolyMorphismDemoOverloading {
    public static void main(String[] args) {
    multiply m=new multiply();
    System.out.println(m.multiply(2, 3));
    System.out.println(m.multiply(2.3, 2.5));
    }
}
