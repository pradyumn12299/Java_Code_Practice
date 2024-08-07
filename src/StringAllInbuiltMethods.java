import java.util.Locale;
import java.util.Scanner;

public class StringAllInbuiltMethods {
    public static void main(String[] args) {
        String str="pradyumn";
        System.out.println(str);
        //Talking Input for String
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(s);
        //count/size of an string is
        int len=s.length();
        System.out.println("length is : "+len);
        //another way to count/size of an array
        System.out.println("length is : "+ s.length());
        // to fetch directly particular element from index value passing
        System.out.println("index 3 value is : "+s.charAt(3));
        // to fetch directly particular element from index value passing
        System.out.println("value a present at index is : "+s.indexOf("a"));
        //compare the two string using compare to method
        System.out.println("comparing two values : "+str.compareTo(s));
        //contains,startswith and endswith methods
        System.out.println("contains checks entered value and string value: "+ s.contains("rad"));
        System.out.println("startswith checks both values should same and starting with: "+s.startsWith("pra"));
        System.out.println("endswith checks both values should same and ending with : "+s.endsWith("mn"));
        //tolowercase,touppercase,concat
        System.out.println("tolowercase : "+s.toLowerCase());
        System.out.println("touppercase : "+s.toUpperCase());
        System.out.println("concatinate : "+s.concat(str));
        //Substring
        System.out.println("ending index :"+s.substring(3));
        System.out.println("particular range you want print : "+s.substring(0,3));
        System.out.println("staring index with: "+s.substring(2));

    }
}
