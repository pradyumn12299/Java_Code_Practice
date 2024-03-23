import java.util.Scanner;

public class SImpleInterestCalculation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter principle amount");
        double amount=sc.nextDouble();
        System.out.println("Enter rate of interest for principle amount");
        double rateOfInterest=sc.nextDouble();
        System.out.println("Enter principle amount time duration");
        double time=sc.nextDouble();

        double simpleInterest= (amount * rateOfInterest * time ) / 100 ;
        System.out.println("simple interest is : "+ simpleInterest);


    }
}
