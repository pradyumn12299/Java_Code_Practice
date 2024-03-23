import java.util.Scanner;

public class SumOfTwoNumbersUsingScanner {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first Number");
        int firstNumber=sc.nextInt();
        System.out.println("Enter second Number");
        int secondNumber=sc.nextInt();
        int sum = firstNumber+ secondNumber;
        System.out.println("sum of two Number : "+ sum);
    }
}
