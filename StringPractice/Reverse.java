package StringPractice;

public class Reverse {
    public static void main(String[] args) {
        String s = "No melon no lemon";
        s = s.replaceAll(" ", "");
       s =  s.toLowerCase();
                String rev = "";
        for(int i = 0;i<= s.length()-1;i++)
        {
            rev = s.charAt(i)+rev;
        }
        System.out.println(rev);
        if(s.equals(rev))
        {
            System.out.print("pallindrome");
        }
        else{
            System.out.print("not pallindrome");
        }
    }
    
}
