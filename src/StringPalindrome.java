public class StringPalindrome {
    public static void main(String[] args) {
        String originString="abcba";
        System.out.println(originString);
        String s=originString;
        String reverseString= "";
        for (int i=0; i< s.length();i++  ){
            reverseString=s.charAt(i)+reverseString;
        }
        System.out.println(reverseString);

        if(originString.equals(reverseString)){
            System.out.println("palindrome");
        }
        else {
            System.out.println("not a palindrome");
        }
    }
}
