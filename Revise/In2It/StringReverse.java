package Revise.In2It;

public class StringReverse {
    public static void main(String[] args) {
        String s = "param";
        String rev = "";

        for(int i = s.length()-1;i>=0;i-- )
        {
            rev = rev+s.charAt(i);
        }
        System.out.println(rev);
    }
    
}
