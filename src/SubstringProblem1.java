public class SubstringProblem1 {
    public static void main(String[] args) {
        String str="physics";
        for (int i = 2; i < 4; i++) {
            System.out.print(str.substring(i));
        }
        System.out.println();
        String s1="abcd";
        for (int i = 0; i < s1.length(); i++) {
            for (int j = i+1; j < s1.length()+1; j++) {
                System.out.print(s1.substring(i,j)+" ");
            }
        }
    }
}
