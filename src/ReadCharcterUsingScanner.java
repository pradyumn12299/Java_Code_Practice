import java.util.Scanner;

public class ReadCharcterUsingScanner {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a character or String");
        char ch=sc.nextLine().charAt(5);
        System.out.println("character is : "+ ch);

    }
}
